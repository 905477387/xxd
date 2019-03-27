package com.xxd.services.impls;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xxd.mappers.XxdGoodsFlashMapper;
import com.xxd.models.XxdGoodsFlash;
import com.xxd.services.XxdGoodsFlashS;

@Service
public class XxdGoodsFlashSI implements XxdGoodsFlashS{

	@Autowired
	private XxdGoodsFlashMapper mapper;

	@Override
	public Integer insert(XxdGoodsFlash model) {
		return mapper.insert(model);
	}

	@Override
	public Integer deleteByPrimaryKey(Integer primaryKey) {
		return mapper.deleteByPrimaryKey(primaryKey);
	}

	@Override
	public Integer updateByPrimaryKeySelective(XxdGoodsFlash model) {
		return mapper.updateByPrimaryKeySelective(model);
	}

	@Override
	public XxdGoodsFlash selectByPrimaryKey(Integer primaryKey) {
		return mapper.selectByPrimaryKey(primaryKey);
	}

	@Override
	public ArrayList<XxdGoodsFlash> selectAll() {
		return null;
	}

	@Override
	public XxdGoodsFlash selectByGoodId(Integer goodsId) {
		return mapper.selectByGoodsId(goodsId);
	}

}
