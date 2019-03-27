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
import com.xxd.models.XxdGoodsFlash;
import com.xxd.models.XxdGoodsPrice;
import com.xxd.models.XxdGoodsPriceFlash;
import com.xxd.services.impls.XxdGoodsFlashBakSI;
import com.xxd.services.impls.XxdGoodsFlashSI;
import com.xxd.services.impls.XxdGoodsPriceFlashBakSI;
import com.xxd.services.impls.XxdGoodsPriceFlashSI;
import com.xxd.services.impls.XxdGoodsPriceSI;
import com.xxd.services.impls.XxdGoodsSI;
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
@RequestMapping(value="/XxdGoodsFlash")
public class XxdGoodsFlashC {
	
	@Autowired
	private XxdGoodsFlashSI goodsFlashService;
	
	@Autowired
	private XxdGoodsPriceSI goodsPriceService;
	
	@Autowired
	private XxdGoodsSI goodsService;
	
	@Autowired
	private XxdGoodsPriceFlashSI goodsPriceFlashService;
	
	@Autowired
	private XxdGoodsFlashBakSI goodsFlashBakService;
	
	@Autowired
	private XxdGoodsPriceFlashBakSI goodsPriceFlashBakService;
	
	@RequestMapping(value= "/updateFlashGoods")
	public String updateFlashGoods(XxdGoodsFlash goodsFlash, HttpServletRequest request) throws IllegalStateException, IOException, ParseException{
		//获取闪购商品
		XxdGoods goodsModel = goodsService.selectByPrimaryKey(goodsFlash.getGoodsId());
		String time = U.md5Hex(System.currentTimeMillis()+"");
		String nowTime = time.substring(28);
		String dirs = (goodsModel.getShowImgDir().split("/"))[0] + Constans.GOODSFLASHIMGDIR + nowTime;
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
        //设置闪购活动封面地址以及相关信息
        goodsFlash.setFlashPicture(dirs + ".jpg");
        goodsFlash.setTime(U.getNowTime());
        goodsFlash.setId(null);
        goodsFlash.setSta(Short.parseShort("1"));
        goodsFlash.setStartTime(goodsFlash.getStartTime() + " " + goodsFlash.getStartTimeHour() + ":00:00");
        goodsFlash.setEndTime(goodsFlash.getEndTime() + " " + goodsFlash.getEndTimeHour() + ":00:00");
        goodsFlashService.insert(goodsFlash);
        //添加对应备份信息
        goodsFlashBakService.insertGoodsFlash(goodsFlash);
		
        Integer goodsPriceNum = Integer.parseInt(request.getParameter("goodsPriceNum"));
        ArrayList<XxdGoodsPrice> goodsPrice = goodsPriceService.selectAllByGoodsId(goodsFlash.getGoodsId());
		//添加商品拼团活动 规格信息
        for(int i = 0;i < goodsPriceNum;i ++) {
        	int stock = Integer.parseInt(request.getParameter("num"+i));
        	BigDecimal flashMemberPrice = new BigDecimal(request.getParameter("flashMemberPrice"+i));
        	XxdGoodsPriceFlash goodsPriceFlash = new XxdGoodsPriceFlash(goodsPrice.get(i));
        	goodsPriceFlash.setGoodsPriceStock(stock);
        	goodsPriceFlash.setGoodsPriceStockBak(stock);
        	goodsPriceFlash.setFlashMemberPrice(flashMemberPrice);
        	goodsPriceFlash.setGoodsFlashId(goodsFlash.getId());
        	goodsPriceFlashService.insert(goodsPriceFlash);
        	//添加对应备份信息
        	goodsPriceFlash.setGoodsFlashBakId(goodsFlash.getId());
        	goodsPriceFlashBakService.insertGoodsPriceFlash(goodsPriceFlash);
        }
        return Constans.ADDSUCCESSHTML;
	}

}
