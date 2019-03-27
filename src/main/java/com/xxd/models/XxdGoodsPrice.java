package com.xxd.models;

import java.math.BigDecimal;

public class XxdGoodsPrice {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xxd_goods_price.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xxd_goods_price.format_name
     *
     * @mbggenerated
     */
    private String formatName;
    
    private String formatColor;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xxd_goods_price.market_price
     *
     * @mbggenerated
     */
    private BigDecimal marketPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xxd_goods_price.leader_price
     *
     * @mbggenerated
     */
    private BigDecimal leaderPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xxd_goods_price.member_price
     *
     * @mbggenerated
     */
    private BigDecimal memberPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xxd_goods_price.remark
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xxd_goods_price.goods_id
     *
     * @mbggenerated
     */
    private Integer goodsId;
    
    private Integer num;
    
    private String img;
    
    private BigDecimal price;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xxd_goods_price.id
     *
     * @return the value of xxd_goods_price.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xxd_goods_price.id
     *
     * @param id the value for xxd_goods_price.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xxd_goods_price.format_name
     *
     * @return the value of xxd_goods_price.format_name
     *
     * @mbggenerated
     */
    public String getFormatName() {
        return formatName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xxd_goods_price.format_name
     *
     * @param formatName the value for xxd_goods_price.format_name
     *
     * @mbggenerated
     */
    public void setFormatName(String formatName) {
        this.formatName = formatName == null ? null : formatName.trim();
    }

    public String getFormatColor() {
		return formatColor;
	}

	public void setFormatColor(String formatColor) {
		this.formatColor = formatColor;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xxd_goods_price.market_price
     *
     * @return the value of xxd_goods_price.market_price
     *
     * @mbggenerated
     */
    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xxd_goods_price.market_price
     *
     * @param marketPrice the value for xxd_goods_price.market_price
     *
     * @mbggenerated
     */
    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xxd_goods_price.leader_price
     *
     * @return the value of xxd_goods_price.leader_price
     *
     * @mbggenerated
     */
    public BigDecimal getLeaderPrice() {
        return leaderPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xxd_goods_price.leader_price
     *
     * @param leaderPrice the value for xxd_goods_price.leader_price
     *
     * @mbggenerated
     */
    public void setLeaderPrice(BigDecimal leaderPrice) {
        this.leaderPrice = leaderPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xxd_goods_price.member_price
     *
     * @return the value of xxd_goods_price.member_price
     *
     * @mbggenerated
     */
    public BigDecimal getMemberPrice() {
        return memberPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xxd_goods_price.member_price
     *
     * @param memberPrice the value for xxd_goods_price.member_price
     *
     * @mbggenerated
     */
    public void setMemberPrice(BigDecimal memberPrice) {
        this.memberPrice = memberPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xxd_goods_price.remark
     *
     * @return the value of xxd_goods_price.remark
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xxd_goods_price.remark
     *
     * @param remark the value for xxd_goods_price.remark
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xxd_goods_price.goods_id
     *
     * @return the value of xxd_goods_price.goods_id
     *
     * @mbggenerated
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xxd_goods_price.goods_id
     *
     * @param goodsId the value for xxd_goods_price.goods_id
     *
     * @mbggenerated
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
}