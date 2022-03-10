package com.linkus.test.service.impl;

import com.linkus.test.model.Handler;
import com.linkus.test.service.IHandler;
import com.linkus.test.service.IWomen;

//public class Son implements IHandler {
//
//	@Override
//	public void HandleMessage(IWomen women) {
//		System.out.println("母亲的请示是："+women.getRequest());
//		System.out.println("儿子的答复是：同意");
//
//
//	}
//
//}
public class Son extends Handler{

	public Son() {
		super(Handler.SON_LEVEL_REQUEST);
	}

	@Override
	protected void response(IWomen women) {
		System.out.println("\n -------------母亲向儿子请示--------------");
		System.out.println("母亲的请示是："+women.getRequest());
		System.out.println("儿子的答复是：同意");
	}
	
}
