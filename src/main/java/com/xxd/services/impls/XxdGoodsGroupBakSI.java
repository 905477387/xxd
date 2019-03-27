package com.xxd.services.impls;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xxd.mappers.XxdGoodsGroupBakMapper;
import com.xxd.models.XxdGoodsGroup;
import com.xxd.models.XxdGoodsGroupBak;
import com.xxd.services.XxdGoodsGroupBakS;

@Service
public class XxdGoodsGroupBakSI implements XxdGoodsGroupBakS{

	@Autowired
	private XxdGoodsGroupBakMapper mapper;

	@Override
	public Integer insert(XxdGoodsGroupBak model) {
		return mapper.insert(model);
	}
	
	@Override
	public Integer deleteByPrimaryKey(Integer primaryKey) {
		return mapper.deleteByPrimaryKey(primaryKey);
	}

	@Override
	public Integer updateByPrimaryKeySelective(XxdGoodsGroupBak model) {
		return mapper.updateByPrimaryKeySelective(model);
	}

	@Override
	public XxdGoodsGroupBak selectByPrimaryKey(Integer primaryKey) {
		return mapper.selectByPrimaryKey(primaryKey);
	}

	@Override
	public ArrayList<XxdGoodsGroupBak> selectAll() {
		return null;
	}

	@Override
	public Integer insertGoodsGroup(XxdGoodsGroup model) {
		return mapper.insertGoodsGroup(model);
	}

}
