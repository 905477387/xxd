package com.xxd.utils;

import java.util.HashMap;

/**
 * 常量工具类
 * @author Liang
 * @version 1.0
 */

public class Constans {
	
	//总配置文件
	public static final String PROSOURCE = "F:/pro/pro.properties";
	//public static final String PROSOURCE = "/home/xxd/xxdAdmin/pro/pro.properties";
	
	//极光推送配置文件
	public static final String SYSTEM_PROPERTIES = "F:/pro/system.properties";
	//统一的Ajax返回格式
	public static HashMap<String, Object> returnCon(final int code, final Object con){
		HashMap<String, Object> result =  new HashMap<String, Object>();
		result.put("code", code);
		result.put("con", con);
		return result;
	}
	
	//用户级别
	public static final String[] USERTYPE = new String[] {"超级管理员", "管理员", "销总", "会员"};
	
	//用户级别代号
	public static final Short SUPERMANAGERUSER = 0;
	public static final Short MANAGERUSER = 1;
	public static final Short LEADERUSER = 2;
	public static final Short MEMBERUSER = 3;
	
	//用户积分冻结原因
	public static final String[] FREEZETYPE = new String[] {"", "非法操作", "卖出商品，获得成本价", "产品包积分冻结", "会员购买商品，获得利润"};
	
	//销总级别代号
	public static final Short FIRSTLEADERLEVEL = 1;
	public static final Short SECONDLEADERLEVEL = 2;
	
	//用户划拨积分类型
	public static final String[] TRANSFERTYPE = new String[] {"", "购买商品", "购买积分", "划拨积分", "其它"};
	public static final Short TRANBUYGOODS = 1;
	public static final Short TRANBUYINTE = 2;
	public static final Short TRANTRANINTE = 3;
	public static final Short TRANOTHER = 4;
	
	//订单类型
	public static final Short ORDERBUY = 2;
	public static final Short ORDER = 1;

	//订单商品状态
	public static final String[] ORDERDETAILSSTA = new String[] {"", "待发货", "待确认收货", "已完成", "超时已收货", "已失效"};
	public static final Short BUYORDERDEFAULT = 1;
	public static final Short BUYORDERWAITSEND = 2;
	public static final Short BUYORDERHAVEEND = 3;
	public static final Short BUYORDERWAITEND = 4;
	public static final Short BUYORDERINVAILD = 5;
	
	//订单付款状态
	public static final Short ORDERWAITPAY = 1;
	public static final Short ORDEROVERPAY = 2;
	public static final Short ORDERNOTPAY = 3;
	public static final Short ORDERINVAILD = 4;
	public static final String[] ORDERSTA = new String[] {"", "待付款", "已付款", "未支付", "已失效"};
	
	//商品类型
	public static final Short GOODSOWNER = 2;
	public static final Short GOODS = 1;
	
	//检查处理图片是否存在
	public static final Short CODE_PICTURE_HANDLE_ERROR = 1;
	public static final Short CODE_PICTURE_HANDLE_SUCCESS = 0;
	public static final String PARAM_PICTURE_HANDLE_ERROR = "名称已存在，换个名字";
	public static final String PARAM_PICTURE_HANDLE_SUCCESS = "商品不存在，添加吧";
	
	//推送消息请用户及时付款
	public static final String UNPAID_ORDER_JPUSH_TITLE="通知";
	public static final String UNPAID_ORDER_JPUSH_CONTENT = "您有订单尚未付款，请及时付款！";
	//推送消息用户想购买的商品上架了
	public static final String JPUSH_HOPE_BUY_GOODS_GROUNDING_TITLE = "通知";
	public static final String JPUSH_HOPE_BUY_GOODS_GROUNDING_CONTENT = "您想购买的商品";
	public static final String JPUSH_HOPE_BUY_GOODS_GROUNDING_CONTENT_END = "上架了";
	
	public static final String JPUSH_EXTRA_MESSAGE_TYPE_UNPAID = "代付款订单";
	public static final String JPUSH_EXTRA_MESSAGE_TYPE_HOPE_BUY = "商品详情";
	
	//权限类型
	public static String[] POWERTYPE = new String[] {"", "页面控制", "按钮控制"};
	
	//商品图片存储规则
	public static final String GOODSIMGDIR = "/goods/";
	//商品规格图片临时保存路径
	public static final String GOODSTMPDIR = "/tmp/";
	//商品规格图片存储规则
	public static final String GOODSPRICEIMGDIR = "/price/";
	//拼团活动图片存储规则
	public static final String GOODSGROUPIMGDIR = "/groups/";
	//闪购活动图片存储规则
	public static final String GOODSFLASHIMGDIR = "/flash/";
	//商品轮播图片存储规则
	public static final String GOODSSHOWIMGDIR = "/si/";
	//商品图文详情存储规则
	public static final String GOODSIMGFONTDIR = "/if/";
	//图片服务器资源
	public static final String IMGHANDLER = "/img";
	
	//商品规格名称拼接符
	public static final String GOODSPRICECONCATSTR = "_xxd_";
	
	//添加成功页面
	public static final String ADDSUCCESSHTML = "/admin/success";
	//添加失败页面
	public static final String ADDERRORHTML = "/admin/error";
	//修改成功页面
	public static final String UPDATESUCCESSHTML = "/admin/successU";
	//修改失败页面
	public static final String UPDATEERRORHTML = "/admin/errorU";
	//推送成功页面
	public static final String JPUSHSUCCESSHTML = "/admin/push";
	//推送失败页面
	public static final String JPUSHEOORHTML = "/admin/pusnError";
	//活动相关提示页面
	public static final String ACTIVITYHTML = "/admin/activity";
	
	//拼团活动相关提示信息
	public static final String ACTIVITYGROUP = "当前商品已参加拼团活动！";
	//闪购相关提示信息
	public static final String ACTIVITYFLASH = "当前商品已参加闪购活动！";
	
	//用户希望购买图片
	public static final String USERHOPEBUYIMG = "http://img.huoxiaoxiao.com/img/hopeBuy/";
	
	//拼团活动固定开始时间
	public static final String GROUPSTARTTIMEHOUR = "08:00:00";
	public static final String GROUPENDTIMEHOUR = "22:00:00";
	
	

	//商品状态
	public static final Short GOODSGROUNDING = 1;//上架
	public static final Short GOODSDISGROUNDING = 2;//下架
	public static final Short GOODSGROUPPRE = 3;//拼团活动预热中
	public static final Short GOODSGROUPING = 4;//拼团活动进行中
	public static final Short GOODSFLASHPRE = 5;//闪购活动预热中
	public static final Short GOODSFLASHING = 6;//闪购活动进行中
}
