package com.wqs.abstractTest;

public class AbstractTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Animal cat=new SmallCat("咪咪",2,"波斯猫");
		CatClass cat=new SmallCat("咪咪",2,"波斯猫");
		
		System.out.println(cat);
		//向上转型至Animal时不能对其访问，因为Animal不含有这个成员变量
		System.out.println(cat.catType);
		System.out.println(cat.name);

	}

}
