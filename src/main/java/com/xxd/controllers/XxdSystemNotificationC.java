package com.xxd.controllers;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xxd.models.XxdGoods;
import com.xxd.models.XxdSystemNotification;
import com.xxd.models.XxdUser;
import com.xxd.models.XxdUserHopeBuy;
import com.xxd.services.XxdGoodsS;
import com.xxd.services.XxdSystemNotificationS;
import com.xxd.services.XxdUserHopeBuyS;
import com.xxd.services.XxdUserS;
import com.xxd.services.impls.XxdUserSI;
import com.xxd.utils.Constans;
import com.xxd.utils.JPushUtil;
import com.xxd.utils.vo.JPushExtras;
import com.xxd.utils.vo.JPushMessage;
import com.xxd.utils.vo.JPushNotification;
import com.xxd.utils.vo.JPushPayload;

/*
 * 系统通知接口
 */
@Controller
@RequestMapping(value = "/xxdSystemNotification")
public class XxdSystemNotificationC{
	
	@Autowired
	private XxdSystemNotificationS xxdSystemNotificationService;
	
	@Autowired
	private XxdUserS xxdUserS;
	
	@Autowired
	private XxdGoodsS serviceImpl;
	
	/**
	 * 系统消息推送和存储
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping(value = "/xxdSystemNotificationPushInsert")
	public String xxdSystemNotificationPushInsert(XxdSystemNotification xxdSystemNotification,HttpServletRequest request,HttpServletResponse reponse) throws Exception {
		System.out.println(xxdSystemNotification);
		//设置推送的日期
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String pushTime = sdf.format(date);
		xxdSystemNotification.setPushtime(pushTime);
		//插入记录
		Integer con = xxdSystemNotificationService.insert(xxdSystemNotification);
		//xxdSystemNotification.getType 为1 是公告 2是活动 3版本
		JPushPayload jPushPayload = new JPushPayload();
		//判断推送的用户平台
		if(xxdSystemNotification.getUserGroup() == 1) {
			jPushPayload.setPlatform(JPushPayload.PlatformDesc.AllPlatform.getValue());;
		}
		//设置推送的用户群体
		jPushPayload.setAudience(JPushPayload.AudienceDesc.All.getValue());
		JPushNotification notification = new JPushNotification();
		//设置推送的标题、内容 、附加内容
		notification.setNotificationTitle(xxdSystemNotification.getTitle());;
		notification.setNotificationContent(xxdSystemNotification.getContent());
		//附加内容否建：JPushExtras类字段可根据自己具体业务调整
		JPushExtras notificationExtras = new JPushExtras();
		jPushPayload.setjPushNotification(notification);
		
		/*//构建推送Message具体信息对象(标题、内容、附加内容)
		JPushMessage message = new JPushMessage();
		message.setMsgTitle("msg_title");
		message.setMsgContent("msg_content");
		jPushPayload.setjPushMessage(message);*/
		
		Boolean flag = JPushUtil.sendPush(jPushPayload);
		if(flag) {
			return Constans.JPUSHSUCCESSHTML;
		}else {
			return Constans.JPUSHEOORHTML;
		}
		
	}
	
	/**
	 * 用户想买商品上架推送消息通知
	 * @param xxdUserHopeBuy
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/userHopeBuyPushMessage")
	public String userHopeBuyPushMessage(XxdUserHopeBuy xxdUserHopeBuy) throws Exception {
		JPushPayload jPushPayload = new JPushPayload();
		jPushPayload.setPlatform(JPushPayload.PlatformDesc.AllPlatform.getValue());
		jPushPayload.setAudience(JPushPayload.AudienceDesc.alias.getValue());
		ArrayList<String> alias = new ArrayList<String>();
		XxdUser xxdUser = xxdUserS.selectByPrimaryKey(xxdUserHopeBuy.getUid());
		//设置alias别名是什么....
		JPushNotification jPushNotification = new JPushNotification();
		jPushNotification.setNotificationTitle(Constans.JPUSH_HOPE_BUY_GOODS_GROUNDING_TITLE);
		jPushNotification.setNotificationContent(Constans.JPUSH_HOPE_BUY_GOODS_GROUNDING_CONTENT+ xxdUserHopeBuy.getName() + Constans.JPUSH_HOPE_BUY_GOODS_GROUNDING_CONTENT_END);
		JPushExtras jPushExtras = new JPushExtras();
		jPushExtras.setType(Constans.JPUSH_EXTRA_MESSAGE_TYPE_HOPE_BUY);
		//添加附加消息....
		jPushNotification.setjPushExtras(jPushExtras);
		jPushPayload.setjPushNotification(jPushNotification);
		Boolean flag = JPushUtil.sendPush(jPushPayload);
		if(flag) {
			return Constans.JPUSHSUCCESSHTML;
		}else {
			return Constans.JPUSHEOORHTML;
		}
	}
	@RequestMapping(value = "/selectLikeGoodsname")
	@ResponseBody
	public HashMap<String, Object> selectLikeUsername(String username){
		return Constans.returnCon(1, serviceImpl.selectByGoodsName(username+"%"));
	}
}

