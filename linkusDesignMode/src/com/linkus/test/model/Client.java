package com.linkus.test.model;

import java.util.ArrayList;
import java.util.Random;

import com.linkus.test.service.IHandler;
import com.linkus.test.service.IWomen;
import com.linkus.test.service.impl.Father;
import com.linkus.test.service.impl.Husband;
//import com.linkus.test.service.impl.Father;
//import com.linkus.test.service.impl.Husband;
//import com.linkus.test.service.impl.Son;
import com.linkus.test.service.impl.Women;

public class Client {
	public static void main(String[] args) {
		Random rand = new Random();
		ArrayList<IWomen> arrayList = new ArrayList<IWomen>();
		for (int i = 0; i < 5; i++) {
			arrayList.add(new Women(rand.nextInt(4),"我要出去逛街"));
		}
//		IHandler father = new Father();
//		IHandler hasband = new Husband();
//		IHandler son = new Son();
//		for(IWomen women : arrayList){
//			if(women.getType() == 1){
//				System.out.println("\n -------------女儿向父亲请示--------------");
//				father.HandleMessage(women);
//			}else if(women.getType() == 2){
//				System.out.println("\n -------------妻子向丈夫请示--------------");
//				hasband.HandleMessage(women);
//			}else if(women.getType() == 3){
//				System.out.println("\n -------------母亲向儿子请示--------------");
//				son.HandleMessage(women);
//			}else {
//				
//			}
//			
//		}
		//定义三个请示对象
		Handler father = new Father();
		Handler hasband = new Husband();
		Handler son = new Husband();
		//设置请示顺序
		father.setNext(hasband);
		hasband.setNext(son);
		for (IWomen women : arrayList) {
			father.HandleMessage(women);
		}
	}
}
