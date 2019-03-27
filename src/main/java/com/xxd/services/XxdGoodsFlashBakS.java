package com.xxd.services;

import java.util.ArrayList;

import com.xxd.models.XxdGoodsFlash;
import com.xxd.models.XxdGoodsFlashBak;

public interface XxdGoodsFlashBakS {

	public Integer insert(XxdGoodsFlashBak model);
	
	public Integer insertGoodsFlash(XxdGoodsFlash model);

	public Integer deleteByPrimaryKey(Integer primaryKey);

	public Integer updateByPrimaryKeySelective(XxdGoodsFlashBak model);

	public XxdGoodsFlashBak selectByPrimaryKey(Integer primaryKey);

	public ArrayList<XxdGoodsFlashBak> selectAll();

}
