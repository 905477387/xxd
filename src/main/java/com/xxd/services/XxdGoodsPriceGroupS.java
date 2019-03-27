package com.xxd.services;

import java.util.ArrayList;

import com.xxd.models.XxdGoodsPriceGroup;

public interface XxdGoodsPriceGroupS {

	public Integer insert(XxdGoodsPriceGroup model);
	
	public ArrayList<XxdGoodsPriceGroup> selectByGoodsGroupId(Integer goods_group_id);
	
	/*public XxdGoodsPriceGroup selectByGoodsIdFomatName(XxdGoodsPriceGroup xxdGoodsPriceGroup);*/
}
