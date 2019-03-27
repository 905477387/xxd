package com.xxd.utils;

import java.util.ArrayList;

import com.xxd.utils.vo.JPushExtras;
import com.xxd.utils.vo.JPushMessage;
import com.xxd.utils.vo.JPushNotification;
import com.xxd.utils.vo.JPushPayload;

public class JPushTest {

    /**
     * 封装推送utils思路：
     *
     * 1、所有推送信息都封装在 JPushPayload 类中，所以整个推送思路就是构建好 JPushPayload 对象；
     *
     * 2、JPushPayload 类封装了推送平台、推送目标、推送通知信息对象、推送message信息对象,需要分别构建好这些内容；
     *
     * 3、推送方法一共四种：
     *  ① sendPush(JPushPayload jPushPayload)  限：1000个别名alias、20个标签tag以下的推送（立即推送）
     *  ② sendPushSchedule(String name, String time, JPushPayload jPushPayload) 限：1000个别名alias、20个标签tag以下的推送（定时推送）
     *  ③ sendPushes(JPushPayload jPushPayload) 批量不限制别名alias、标签tag 个数（立即推送）
     *  ④ sendPushesSchedule(final String name, final String time, JPushPayload jPushPayload) 批量不限制别名alias、标签tag 个数（定时推送）
     */
    public static void main(String[] args) throws Exception{
    	JPushPayload jPushPayload = new JPushPayload();
        ArrayList<Integer> jPushExtra = new ArrayList<Integer>();
        jPushExtra.add(1);
        jPushExtra.add(2);
        //设置推送平台：所有平台、IOS、Android
        jPushPayload.setPlatform(JPushPayload.PlatformDesc.AllPlatform.getValue());
        //设置推送目标：所有人、按别名推送、按标签推送
        jPushPayload.setAudience(JPushPayload.AudienceDesc.alias.getValue());
      //如果是按别名推送、按标签推送必须构建推送名单List，所有人不用再构建
        ArrayList<String> aliasList = new ArrayList<String>();
        //别名和标签是根据自己业务自行定义，如：每个用户手机号可作为别名定位每个用户、VIP用户作为tag定位一类用户
        aliasList.add("865199");
        jPushPayload.setAliases(aliasList);

        //构建推送Notification具体信息对象(标题、内容、附加内容)
        JPushNotification notification = new JPushNotification();
        //附加内容构建：JPushExtras类字段可根据自己具体业务调整
        //我的业务：传递给客户端(IOS、Android)作为接收通知后页面跳转逻辑依据
       // notificationExtras.setPageType(JPushExtras.PageTypeDesc.MembershipCenterHomePage.getValue());
        jPushPayload.setjPushNotification(notification);
		notification.setNotificationTitle(Constans.UNPAID_ORDER_JPUSH_TITLE);
		notification.setNotificationContent(Constans.UNPAID_ORDER_JPUSH_CONTENT);
        //附加内容构建：JPushExtras类字段可根据自己具体业务调整
		JPushExtras notificationExtras = new JPushExtras();
		notificationExtras.setType("测试分类");
		notificationExtras.setJpushTypeId(jPushExtra);
		notification.setjPushExtras(notificationExtras);
        //构建推送Message具体信息对象(标题、内容、附加内容)
      /*  JPushMessage message = new JPushMessage();
        message.setMsgTitle("msg_title");
        message.setMsgContent("msg_content");
        jPushPayload.setjPushMessage(message);*/

        //推送
        JPushUtil.sendPush(jPushPayload);
    }

}
