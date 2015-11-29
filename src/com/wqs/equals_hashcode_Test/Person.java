package com.wqs.equals_hashcode_Test;

import java.util.Random;

public class Person {
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person )
		{
			Person p=(Person)obj;
			if(p.name==this.name&&p.age==this.age)
				return true;
			else
				return false;
		}
		else
		return super.equals(obj);
		//return false;
	}

	@Override
	public int hashCode() {
	//	return this.name.hashCode();
//		Random rand=new Random();
//		return  rand.nextInt(100);
		return super.hashCode();
	}

	public String name;  
	 public int age;
	 
	 public Person(String name,int age)
	 {
		 this.name=name;
		 this.age=age;
	 }
}
