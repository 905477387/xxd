package com.xxd.services;

import java.util.ArrayList;

import com.xxd.models.XxdGoodsPriceGroup;
import com.xxd.models.XxdGoodsPriceGroupBak;

public interface XxdGoodsPriceGroupBakS {

	public Integer insert(XxdGoodsPriceGroupBak model);
	
	public Integer insertGoodsPriceGroup(XxdGoodsPriceGroup model);

	public Integer deleteByPrimaryKey(Integer primaryKey);

	public Integer updateByPrimaryKeySelective(XxdGoodsPriceGroupBak model);

	public XxdGoodsPriceGroupBak selectByPrimaryKey(Integer primaryKey);

	public ArrayList<XxdGoodsPriceGroupBak> selectAll();

}
