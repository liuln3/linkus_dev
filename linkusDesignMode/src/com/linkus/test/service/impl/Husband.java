package com.linkus.test.service.impl;

import com.linkus.test.model.Handler;
import com.linkus.test.service.IHandler;
import com.linkus.test.service.IWomen;

//public class Husband implements IHandler {
//
//	@Override
//	public void HandleMessage(IWomen women) {
//		System.out.println("妻子的请示是："+women.getRequest());
//		System.out.println("丈夫的答复是：同意");
//
//	}
//
//}
public class Husband extends Handler {

	public Husband() {
		super(Handler.HUSBAND_LEVEL_REQUEST);
	}

	@Override
	protected void response(IWomen women) {
		System.out.println("\n -------------妻子向丈夫请示--------------");
		System.out.println(women.getRequest());
		System.out.println("丈夫的答复是：同意");
	}
	
	
	
	
}