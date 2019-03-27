package com.xxd.services;

import java.util.ArrayList;

import com.xxd.models.XxdGoodsFlash;

public interface XxdGoodsFlashS {

	public Integer insert(XxdGoodsFlash model);

	public Integer deleteByPrimaryKey(Integer primaryKey);

	public Integer updateByPrimaryKeySelective(XxdGoodsFlash model);

	public XxdGoodsFlash selectByPrimaryKey(Integer primaryKey);
	
	public XxdGoodsFlash selectByGoodId(Integer goodsId);

	public ArrayList<XxdGoodsFlash> selectAll();

}
