package com.wqs.finalTest;

public class A {
	
	public final int count=0;
	
	final   void method_final()
	{
		System.out.println("这个方法是父类final方法");
	}
	
	public  void method()
	{
		System.out.println("这个方法是父类final方法");
	}
	
	
	public  void method_finalPara(final B b)
	{
		b.i=7;
		System.out.println("修改b的属性值成功"+b.i);
		
		//会报错，提示去除final,这样可以保证b的引用对象不可改变，但是b的对象的属性值可以改变
		//b=new B(3);
	 }

}
