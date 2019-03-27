package com.xxd.utils.vo;

import java.math.BigDecimal;
import java.util.ArrayList;

public class JPushExtras {

    private String type;  //推送分类
    
    private ArrayList<String> jpushTypeId; //订单ID 
    
    private String groupId;//拼团ID
    
    private String integertionId; //用户积分信息ID
    
    private String integrationType; // 用户积分类型
    
    private String totalPrice;//订单价格
    
    private String orderType; //订单分类
    
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public ArrayList<String> getJpushTypeId() {
		return jpushTypeId;
	}

	public void setJpushTypeId(ArrayList<Integer> jpushTypeId) {
		for(Integer jt : jpushTypeId) {
			this.jpushTypeId.add(jt.toString());
		}
	}

	public String getIntegertionId() {
		return integertionId;
	}

	public void setIntegertionId(Integer integertionId) {
		this.integertionId = integertionId.toString();
	}

	public String getIntegrationType() {
		return integrationType;
	}

	public void setIntegrationType(Short integrationType) {
		this.integrationType = integrationType.toString();
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId.toString();
	}

	public String getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice.toString();
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(Short orderType) {
		this.orderType = orderType.toString();
	}
}
