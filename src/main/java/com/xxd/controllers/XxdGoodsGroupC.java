package com.xxd.controllers;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import com.xxd.models.XxdGoods;
import com.xxd.models.XxdGoodsGroup;
import com.xxd.models.XxdGoodsPrice;
import com.xxd.models.XxdGoodsPriceGroup;
import com.xxd.models.XxdSystem;
import com.xxd.services.impls.XxdGoodsGroupBakSI;
import com.xxd.services.impls.XxdGoodsGroupSI;
import com.xxd.services.impls.XxdGoodsPriceGroupBakSI;
import com.xxd.services.impls.XxdGoodsPriceGroupSI;
import com.xxd.services.impls.XxdGoodsPriceSI;
import com.xxd.services.impls.XxdGoodsSI;
import com.xxd.services.impls.XxdSystemSI;
import com.xxd.utils.Constans;
import com.xxd.utils.ProperU;
import com.xxd.utils.U;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

@Controller
@RequestMapping(value="/XxdGoodsGroup")
public class XxdGoodsGroupC {

	@Autowired
	private XxdGoodsGroupSI xxdGoodsGroupS;
	
	@Autowired
	private XxdGoodsPriceSI goodsPriceService;
	
	@Autowired
	private XxdGoodsSI xxdGoodsService;
	
	@Autowired
	private XxdGoodsPriceGroupSI xxdGoodsPriceGroups;
	
	@Autowired
	private XxdGoodsPriceGroupBakSI goodsPriceGroupBakService;
	
	@Autowired
	private XxdSystemSI systemService;
	
	@Autowired
	private XxdGoodsGroupBakSI goodsGroupBakService;
	
	@RequestMapping(value= "/updateGroupGoods")
	public String UpdateGoodsGroup(XxdGoodsGroup goodsGroup, HttpServletRequest request) throws IllegalStateException, IOException, ParseException{
		//获取拼团商品
		XxdGoods goodsModel = xxdGoodsService.selectByPrimaryKey(goodsGroup.getGoodsId());
		String time = U.md5Hex(System.currentTimeMillis()+"");
		String nowTime = time.substring(28);
		String dirs = (goodsModel.getShowImgDir().split("/"))[0] + Constans.GOODSGROUPIMGDIR + nowTime;
		String dir = Constans.GOODSIMGDIR + dirs;
		//使用okhttp发起请求，传输图片
		OkHttpClient client = new OkHttpClient();
		//form表单上传
		MultipartBody.Builder requestBody = new MultipartBody.Builder().setType(MultipartBody.FORM);
		MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest)request;
		Map<String, MultipartFile> files = multiRequest.getFileMap();
		MultipartFile file = files.get("file");
		String path = ProperU.read(ProperU.read(Constans.PROSOURCE, "img"), "imgSaveDir") + Constans.GOODSIMGDIR + Constans.GOODSTMPDIR + nowTime + ".jpg";
		new File(path.substring(0, path.lastIndexOf("/"))).mkdirs();
		File tmpFile = new File(path);
		file.transferTo(tmpFile);
		RequestBody body = RequestBody.create(MediaType.parse("image/*"), tmpFile);
		String filename = tmpFile.getName();
		requestBody.addFormDataPart("file", filename, body);
		Request req = new Request.Builder().url(ProperU.read(Constans.PROSOURCE, "host") + "/page/goodsPriceImgAdd?dir="+dir).post(requestBody.build()).build();
		// readTimeout("请求超时时间" , 时间单位);
        client.newBuilder().readTimeout(5000, TimeUnit.MILLISECONDS).build().newCall(req).enqueue(new Callback() {
            public void onFailure(Call call, IOException e) {
                U.exceptionLog(e, "goodsPriceException");
            }
            public void onResponse(Call call, Response response) throws IOException {
                if (!response.isSuccessful()) {
                	U.logAction("goodsPriceFailed");
                }
            }
        });
        //设置拼团活动封面地址
        goodsGroup.setGroupPicture(dirs + ".jpg");
        goodsGroup.setId(null);
        goodsGroup.setGroupStartTime(goodsGroup.getGroupStartTime() + " " + Constans.GROUPSTARTTIMEHOUR);
        goodsGroup.setGroupEndTime(goodsGroup.getGroupEndTime() + " " + Constans.GROUPENDTIMEHOUR);
        goodsGroup.setGroupTimes(0);
        goodsGroup.setTime(U.getNowTime());
        //添加商品拼团活动主要信息
        xxdGoodsGroupS.insert(goodsGroup);
        //添加对应备份信息
        goodsGroupBakService.insertGoodsGroup(goodsGroup);
		
        Integer goodsPriceNum = Integer.parseInt(request.getParameter("goodsPriceNum"));
        ArrayList<XxdGoodsPrice> goodsPrice = goodsPriceService.selectAllByGoodsId(goodsGroup.getGoodsId());
        ArrayList<XxdSystem> leaderProfit = systemService.selectLikeByName("leaderProfit%");
		BigDecimal leaderProfit3 = new BigDecimal("0");
		BigDecimal leaderProfit2 = new BigDecimal("0");
		for(XxdSystem lp : leaderProfit) {
			if(lp.getName().equals("leaderProfit")) {
				leaderProfit3 = new BigDecimal(lp.getValue());
			}
			if(lp.getName().equals("leaderProfit2")) {
				leaderProfit2 = new BigDecimal(lp.getValue());
			}
		}
		//添加商品拼团活动 规格信息
		BigDecimal profit = leaderProfit2.add(leaderProfit3).divide(new BigDecimal(200));
        for(int i = 0;i < goodsPriceNum;i ++) {
        	int stock = Integer.parseInt(request.getParameter("num"+i));
        	XxdGoodsPriceGroup goodsPriceGroup = new XxdGoodsPriceGroup(goodsPrice.get(i), profit);
        	goodsPriceGroup.setGoodsPriceStock(stock);
        	goodsPriceGroup.setGoodsPriceStockBak(stock);
        	goodsPriceGroup.setGoodsGroupId(goodsGroup.getId());
        	xxdGoodsPriceGroups.insert(goodsPriceGroup);
        	//添加对应备份信息
        	goodsPriceGroup.setGoodsGroupBakId(goodsGroup.getId());
        	goodsPriceGroupBakService.insertGoodsPriceGroup(goodsPriceGroup);
        }
        
        return Constans.ADDSUCCESSHTML;
	}
}
