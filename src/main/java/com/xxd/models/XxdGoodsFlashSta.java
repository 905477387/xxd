package com.xxd.models;

import java.io.Serializable;

public class XxdGoodsFlashSta implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Short grounding_sta;
	
	private String start_time;
	
	private String end_time;
	
	public XxdGoodsFlashSta() {}

	public Short getGrounding_sta() {
		return grounding_sta;
	}

	public void setGrounding_sta(Short grounding_sta) {
		this.grounding_sta = grounding_sta;
	}

	public String getStart_time() {
		return start_time;
	}

	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}

	public String getEnd_time() {
		return end_time;
	}

	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}
	
}
