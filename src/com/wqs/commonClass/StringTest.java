package com.wqs.commonClass;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hello";
		String s2="hello";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		s1=new String("world");
		s2=new String("world");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		char c[]={'w','o','r','l','d'};
		String s3=new String(c);
		
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		
		String s4="helloworld";
		String s5=(String) s4.subSequence(5,10);
		System.out.println(s1==s5);
		System.out.println(s1.equals(s5)); 
		
		//String 是特殊的引用类型，数据存放在数据区，栈空间有个引用指针，
		//new 或者通过裁剪、替换操作的字符串都会分配新的存储空间，在比较地址时（==）记过是false,

	}

}
