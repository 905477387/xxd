package com.xxd.services;

import java.util.ArrayList;

import com.xxd.models.XxdGoodsPriceFlash;

public interface XxdGoodsPriceFlashS {

	public Integer insert(XxdGoodsPriceFlash model);

	public Integer deleteByPrimaryKey(Integer primaryKey);

	public Integer updateByPrimaryKeySelective(XxdGoodsPriceFlash model);

	public XxdGoodsPriceFlash selectByPrimaryKey(Integer primaryKey);

	public ArrayList<XxdGoodsPriceFlash> selectAll();
	
	public ArrayList<XxdGoodsPriceFlash> selectByGoodsFlashId(Integer goodsFlashId);

}
