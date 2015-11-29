package com.wqs.interfaceTest;

public class interfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//接口可以用来存储静态变量
		System.out.println(InterfaceA.id);
		System.out.println(InterfaceB.id);
		System.out.println(InterfaceC.id);
		System.out.println(InterfaceC.value);
		System.out.println(InterfaceC.value1);
		System.out.println(InterfaceC.value2);
		
		
		//接口子类实现
		InterfaceA a=new A();
		System.out.println(a.id);
		a.methodA();
		 
		
		//接口完成多态功能
		InterfaceA b1=new B();
		System.out.println(b1.id);
		b1.methodA();
		//这里是无法访问methodB方法的
		
		
		InterfaceB b2=new B();
		System.out.println(b2.id);
		b2.methodB();
		
		
		//接口继承
		InterfaceD d=new D();
		d.methodA();
		d.methodB();
		d.methodD();
		
		//两个接口具有相同方法,不同的接口会调用那个方法，不能依据返回值来实现多种接口方法
		InterfaceE ef1=new EF();
		InterfaceF ef2=new EF();
		
		ef1.sameMethod();
		//ef1.sameMethod2();
		
		ef2.sameMethod();
		//ef2.sameMethod2();
		
		

	}

}
