package com.xxd.services.impls;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xxd.mappers.XxdIntegrationFreezeMapper;
import com.xxd.models.XxdIntegrationFreeze;
import com.xxd.services.XxdIntegrationFreezeS;
import com.xxd.utils.U;

@Service
public class XxdIntegrationFreezeSI implements XxdIntegrationFreezeS{

	@Autowired
	private XxdIntegrationFreezeMapper mapper;
	
	@Override
	public Integer insert(XxdIntegrationFreeze model) {
		//添加用户的添加时间
		model.setTime(U.getNowTime());
		return mapper.insert(model);
	}

	@Override
	public Integer deleteByPrimaryKey(Integer primaryKey) {
		return mapper.deleteByPrimaryKey(primaryKey);
	}

	@Override
	public Integer updateByPrimaryKeySelective(XxdIntegrationFreeze model) {
		return mapper.updateByPrimaryKeySelective(model);
	}

	@Override
	public XxdIntegrationFreeze selectByPrimaryKey(Integer primaryKey) {
		return mapper.selectByPrimaryKey(primaryKey);
	}
	
	@Override
	public ArrayList<XxdIntegrationFreeze> selectByUid(Integer uid) {
		return mapper.selectByUid(uid);
	}
	
	@Override
	public XxdIntegrationFreeze selectByPrimaryKeyParentId(Integer primaryKey, Integer parent_id) {
		return mapper.selectByPrimaryKeyParentId(primaryKey, parent_id);
	}

	@Override
	public ArrayList<XxdIntegrationFreeze> selectAll() {
		return mapper.selectAll();
	}
	
}
