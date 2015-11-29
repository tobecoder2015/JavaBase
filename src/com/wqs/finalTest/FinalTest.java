package com.wqs.finalTest;

public class FinalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("_____________E e=new E()_________________");
		E e=new E();
		//无法修改父类final变量
		//e.count=5;
		
		//可以方位父类的非final方法，但是不能访问final方法
		e.method();
	
		//子类e不能重写父类final方法，但是可以调用，调用的完全是父类的方法
		e.method_final();
		
		e.method_finalPara(new B(1));
		
		System.out.println("______________A a=new A()________________");
		A a=new A();
		a.method();
		a.method_final();
		e.method_finalPara(new B(2));
		
		System.out.println("_________________A ae=new E()_____________");
		A ae=new E();
		
		//无法修改父类final变量
		//ae.count=3;
		ae.method();
		ae.method_final();
		ae.method_finalPara(new B(3));

	}

}
