package com.wqs.abstractTest;

public abstract class CatClass extends Animal{ 
	

	public String catType;
	
	public CatClass(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	
	public CatClass(String name, int age,String type) {
		super(name, age);
		this.catType=type;
		// TODO Auto-generated constructor stub
	}
	

}
