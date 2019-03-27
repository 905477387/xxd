package com.xxd.utils;

import com.xxd.services.XxdBuyOrderS;
import com.xxd.services.impls.XxdBuyOrderSI;
import com.xxd.services.impls.XxdBuyOrderSI2;

public class Abd {
	
	public XxdBuyOrderS getInstance(int a) {
		if(a == 2) {
			return new XxdBuyOrderSI2();
		}else {
			return new XxdBuyOrderSI();
		}
	}

	
	public static void main(String[] args) {
		Abd abd = new Abd();
		abd.getInstance(1).deleteByPrimaryKey(1);
		abd.getInstance(2).deleteByPrimaryKey(1);
	}
}
