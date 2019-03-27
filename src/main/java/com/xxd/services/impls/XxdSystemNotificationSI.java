package com.xxd.services.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xxd.mappers.XxdSystemNotificationMapper;
import com.xxd.models.XxdSystemNotification;
import com.xxd.services.XxdSystemNotificationS;

@Service
public class XxdSystemNotificationSI implements XxdSystemNotificationS {

	@Autowired
	private XxdSystemNotificationMapper xxdSystemNotificationMapper;
	
	@Override
	public Integer insert(XxdSystemNotification xxdSystemNotification) {
		return xxdSystemNotificationMapper.insert(xxdSystemNotification);
	}

}
