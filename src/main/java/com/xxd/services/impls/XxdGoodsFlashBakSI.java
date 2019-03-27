package com.xxd.services.impls;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xxd.mappers.XxdGoodsFlashBakMapper;
import com.xxd.models.XxdGoodsFlash;
import com.xxd.models.XxdGoodsFlashBak;
import com.xxd.services.XxdGoodsFlashBakS;

@Service
public class XxdGoodsFlashBakSI implements XxdGoodsFlashBakS{

	@Autowired
	private XxdGoodsFlashBakMapper mapper;

	@Override
	public Integer insert(XxdGoodsFlashBak model) {
		return mapper.insert(model);
	}

	@Override
	public Integer deleteByPrimaryKey(Integer primaryKey) {
		return mapper.deleteByPrimaryKey(primaryKey);
	}

	@Override
	public Integer updateByPrimaryKeySelective(XxdGoodsFlashBak model) {
		return mapper.updateByPrimaryKeySelective(model);
	}

	@Override
	public XxdGoodsFlashBak selectByPrimaryKey(Integer primaryKey) {
		return mapper.selectByPrimaryKey(primaryKey);
	}

	@Override
	public ArrayList<XxdGoodsFlashBak> selectAll() {
		return null;
	}

	@Override
	public Integer insertGoodsFlash(XxdGoodsFlash model) {
		return mapper.insertGoodsFlash(model);
	}

}
