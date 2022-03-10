package com.linkus.test.service.impl;

import com.linkus.test.service.IWomen;

public class Women implements IWomen {
	
	private int type = 0;
	private String request = "";
	
//	public Women(int _type,String _request){
//		this.type = _type;
//		this.request = _request;
//	}
	//构造函数传递过来请求
	public Women(int _type,String _request){
		this.type = _type;
		switch (this.type) {
		case 1:
			this.request = "女儿的请求是：" + _request;
			break;
		case 2:
			this.request = "妻子的请求是：" + _request;
			break;
		case 3:
			this.request = "母亲的请求是：" + _request;
			break;
		}
	}
	
	
//	
//	public void setType(int type) {
//		this.type = type;
//	}
//
//	public void setRequest(String request) {
//		this.request = request;
//	}

	public int getType() {
		return this.type;
	}

	public String getRequest() {
		return this.request;
	}

}
