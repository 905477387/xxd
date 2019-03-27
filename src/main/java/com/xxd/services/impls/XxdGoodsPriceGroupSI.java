package com.xxd.services.impls;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xxd.mappers.XxdGoodsPriceGroupMapper;
import com.xxd.models.XxdGoodsPriceGroup;
import com.xxd.services.XxdGoodsPriceGroupS;

@Service
public class XxdGoodsPriceGroupSI implements XxdGoodsPriceGroupS {

	@Autowired
	XxdGoodsPriceGroupMapper mapper;
	
	@Override
	public Integer insert(XxdGoodsPriceGroup model) {
		return mapper.insert(model);
	}

	@Override
	public ArrayList<XxdGoodsPriceGroup> selectByGoodsGroupId(Integer goods_group_id) {
		return mapper.selectByGoodsGroupId(goods_group_id);
	}

	/*@Override
	public XxdGoodsPriceGroup selectByGoodsIdFomatName(XxdGoodsPriceGroup xxdGoodsPriceGroup) {
		return mapper.selectByGroupIdFormatName(xxdGoodsPriceGroup);
	}*/

}
