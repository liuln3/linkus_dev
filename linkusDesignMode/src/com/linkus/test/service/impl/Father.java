package com.linkus.test.service.impl;

import com.linkus.test.model.Handler;
import com.linkus.test.service.IHandler;
import com.linkus.test.service.IWomen;

//public class Father implements IHandler {
//
//	@Override
//	public void HandleMessage(IWomen women) {
//		System.out.println("女儿的请示是："+women.getRequest());
//		System.out.println("父亲的答复是：同意");
//	}
//
//}
public class Father extends Handler {

	public Father() {
		super(Handler.FATHER_LEVEL_REQUEST);//? Handler.FATHER_LEVEL_REQUEST引用
	}

	@Override
	protected void response(IWomen women) {
		System.out.println("\n -------------女儿向父亲请示--------------");
		System.out.println(women.getRequest());
		System.out.println("父亲的答复是：同意");
	}
	
	
}