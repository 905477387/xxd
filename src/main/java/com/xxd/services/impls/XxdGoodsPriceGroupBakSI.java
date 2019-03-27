package com.xxd.services.impls;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xxd.mappers.XxdGoodsPriceGroupBakMapper;
import com.xxd.models.XxdGoodsPriceGroup;
import com.xxd.models.XxdGoodsPriceGroupBak;
import com.xxd.services.XxdGoodsPriceGroupBakS;

@Service
public class XxdGoodsPriceGroupBakSI implements XxdGoodsPriceGroupBakS{

	@Autowired
	private XxdGoodsPriceGroupBakMapper mapper;

	@Override
	public Integer insert(XxdGoodsPriceGroupBak model) {
		return mapper.insert(model);
	}

	@Override
	public Integer deleteByPrimaryKey(Integer primaryKey) {
		return mapper.deleteByPrimaryKey(primaryKey);
	}

	@Override
	public Integer updateByPrimaryKeySelective(XxdGoodsPriceGroupBak model) {
		return mapper.updateByPrimaryKeySelective(model);
	}

	@Override
	public XxdGoodsPriceGroupBak selectByPrimaryKey(Integer primaryKey) {
		return mapper.selectByPrimaryKey(primaryKey);
	}

	@Override
	public ArrayList<XxdGoodsPriceGroupBak> selectAll() {
		return null;
	}

	@Override
	public Integer insertGoodsPriceGroup(XxdGoodsPriceGroup model) {
		return mapper.insertGoodsPriceGroup(model);
	}

}
