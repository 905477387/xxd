package com.xxd.services;

import java.util.ArrayList;

import com.xxd.models.XxdGoodsGroup;
import com.xxd.models.XxdGoodsGroupBak;

public interface XxdGoodsGroupBakS {

	public Integer insert(XxdGoodsGroupBak model);
	
	public Integer insertGoodsGroup(XxdGoodsGroup model);

	public Integer deleteByPrimaryKey(Integer primaryKey);

	public Integer updateByPrimaryKeySelective(XxdGoodsGroupBak model);

	public XxdGoodsGroupBak selectByPrimaryKey(Integer primaryKey);

	public ArrayList<XxdGoodsGroupBak> selectAll();
	
}
