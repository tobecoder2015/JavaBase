package com.wqs.enumTest;

public class enumTest {
	public static void main(String[] args)
	{
		
		System.out.println("_______杀人游戏开始_________");
		System.out.println("_______角色说明_________");
		
		  for (identity kk : identity.values()) { 
	            System.out.println("角色："+kk + "   " +"别称："+kk.getDesc()+ "   任务:"+kk.getFunction()+"       "+"  初始生命状态:"+kk.isLive()); 
	        } 
		  
		  identity.平民.killed();
		  System.out.println( "平民的生存状态： "+identity.平民.isLive());
		  identity.平民.commomMethod();
		  identity.staticMethod();
		
		 
		  
	}

}
