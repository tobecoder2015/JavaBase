package com.wqs.equals_hashcode_Test;

public class EqualTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("wqs", 12);  
        Person p2 = new Person("wqs", 12); 
          
        System.out.println(p1 + " " + p1.hashCode());  
        System.out.println(p2 + " " + p2.hashCode());  
          
        System.out.println(p1.equals(p2)); 
        System.out.println(p1==p2); 
        
	}

}
