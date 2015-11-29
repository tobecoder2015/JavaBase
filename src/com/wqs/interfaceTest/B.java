package com.wqs.interfaceTest;

public class B implements InterfaceA, InterfaceB {

	@Override
	public void methodB() {
		// TODO Auto-generated method stub
		System.out.println("methodB 方法实现");
	}

	@Override
	public void methodA() {
		// TODO Auto-generated method stub
		System.out.println("methodA 方法实现");
	}

}
