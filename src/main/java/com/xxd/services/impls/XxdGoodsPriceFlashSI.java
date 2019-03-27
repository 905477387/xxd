package com.xxd.services.impls;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xxd.mappers.XxdGoodsPriceFlashMapper;
import com.xxd.models.XxdGoodsPriceFlash;
import com.xxd.services.XxdGoodsPriceFlashS;

@Service
public class XxdGoodsPriceFlashSI implements XxdGoodsPriceFlashS{

	@Autowired
	private XxdGoodsPriceFlashMapper mapper;

	@Override
	public Integer insert(XxdGoodsPriceFlash model) {
		return mapper.insertSelective(model);
	}

	@Override
	public Integer deleteByPrimaryKey(Integer primaryKey) {
		return mapper.deleteByPrimaryKey(primaryKey);
	}

	@Override
	public Integer updateByPrimaryKeySelective(XxdGoodsPriceFlash model) {
		return mapper.updateByPrimaryKeySelective(model);
	}

	@Override
	public XxdGoodsPriceFlash selectByPrimaryKey(Integer primaryKey) {
		return mapper.selectByPrimaryKey(primaryKey);
	}

	@Override
	public ArrayList<XxdGoodsPriceFlash> selectAll() {
		return null;
	}

	@Override
	public ArrayList<XxdGoodsPriceFlash> selectByGoodsFlashId(Integer goodsFlashId) {
		return mapper.selectByGoodsFlashId(goodsFlashId);
	}

}
