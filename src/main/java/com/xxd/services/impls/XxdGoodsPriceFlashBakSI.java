package com.xxd.services.impls;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xxd.mappers.XxdGoodsPriceFlashBakMapper;
import com.xxd.models.XxdGoodsPriceFlash;
import com.xxd.models.XxdGoodsPriceFlashBak;
import com.xxd.services.XxdGoodsPriceFlashBakS;

@Service
public class XxdGoodsPriceFlashBakSI implements XxdGoodsPriceFlashBakS{

	@Autowired
	private XxdGoodsPriceFlashBakMapper mapper;

	@Override
	public Integer insert(XxdGoodsPriceFlashBak model) {
		return mapper.insert(model);
	}

	@Override
	public Integer deleteByPrimaryKey(Integer primaryKey) {
		return mapper.deleteByPrimaryKey(primaryKey);
	}

	@Override
	public Integer updateByPrimaryKeySelective(XxdGoodsPriceFlashBak model) {
		return mapper.updateByPrimaryKeySelective(model);
	}

	@Override
	public XxdGoodsPriceFlashBak selectByPrimaryKey(Integer primaryKey) {
		return mapper.selectByPrimaryKey(primaryKey);
	}

	@Override
	public ArrayList<XxdGoodsPriceFlashBak> selectAll() {
		return null;
	}

	@Override
	public Integer insertGoodsPriceFlash(XxdGoodsPriceFlash model) {
		return mapper.insertGoodsPriceFlash(model);
	}

}
