package com.xxd.models;

public class XxdUserHopeBuy {

	private Integer id;
	private String contents;
	private String goodsImg;
	private Integer sign;
	public String getGoodsImg() {
		return goodsImg;
	}
	public void setGoodsImg(String goodsImg) {
		this.goodsImg = goodsImg;
	}
	private Integer uid;
	private String name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSign() {
		return sign;
	}
	public void setSign(Integer sign) {
		this.sign = sign;
	}
	@Override
	public String toString() {
		return "XxdUserHopeBuy [id=" + id + ", contents=" + contents + ", goodsImg=" + goodsImg + ", sign=" + sign
				+ ", uid=" + uid + ", name=" + name + "]";
	}
	
}
