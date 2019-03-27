package com.xxd.services;

import java.util.ArrayList;

import com.xxd.models.XxdGoodsPriceFlash;
import com.xxd.models.XxdGoodsPriceFlashBak;

public interface XxdGoodsPriceFlashBakS {

	public Integer insert(XxdGoodsPriceFlashBak model);
	
	public Integer insertGoodsPriceFlash(XxdGoodsPriceFlash model);

	public Integer deleteByPrimaryKey(Integer primaryKey);

	public Integer updateByPrimaryKeySelective(XxdGoodsPriceFlashBak model);

	public XxdGoodsPriceFlashBak selectByPrimaryKey(Integer primaryKey);

	public ArrayList<XxdGoodsPriceFlashBak> selectAll();

}
