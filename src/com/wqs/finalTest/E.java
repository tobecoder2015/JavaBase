package com.wqs.finalTest;

public class E extends A{

	
	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("子类重写父类非final方法");
	}

	//提示子类不能重写父类的final方法
//	@Override
//	public void method_final() {
//		// TODO Auto-generated method stub
//		System.out.println("子类重写父类非final方法");
//	}
//	
	@Override
	public void method_finalPara(B b) {
		// TODO Auto-generated method stub
		System.out.println("子类重写父类含有final变量的方法");
		b.i=5;
		
		
		super.method_finalPara(b);
		
		
		//子类重写的method_finalPara的变量不含final修饰参数，所以子类可以对b重新赋值，多态过程也可以改变b的指向
		b=new B(6);
		System.out.println("给b重新赋予新的B对象，改变其引用");
	}

}
