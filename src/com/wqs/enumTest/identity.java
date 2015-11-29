package com.wqs.enumTest;
 
//实现了Life接口，需要实现借口方法
public enum identity implements Life {
	杀手(true)//实例构造函数
	{
		//实现枚举类定义的抽象方法
		 public String getDesc() { 
	            return "杀手"; 
	        } 
	},
	//本身类似一个匿名类
	警察(true)
	{
		 public String getDesc() { 
	            return "警察"; 
	        } 
		
	},
	法官(true)
	{
		 public String getDesc() { 
	            return "法官"; 
	        } 
	},
	平民(true)
	{
		 public String getDesc() { 
	            return "平民"; 
	        } 
	};
	
	//实现接口方法
	@Override
	public boolean isLive() {
		// TODO Auto-generated method stub
		return isLive;
	}

	//实现接口方法
	@Override
	public void killed() {
		// TODO Auto-generated method stub
		this.isLive=false;
		
	}
	
	

	//普通方法
	public String getFunction() { 
	        switch (this.ordinal()) { 
	            case 0: 
	                return "杀死警察，保全自己"; 
	            case 1: 
	                return "引导民众杀死杀手"; 
	            case 2: 
	                return "引导大家进行游戏"; 
	            case 3: 
	                return "一介平民,可参与公选杀死嫌疑人"; 
	            default: 
	                return "没有该枚举值！"; 
	        } 
	    } 
	
	//实例成员变量
	  private boolean isLive;        //枚举说明 

	    //私有的构造函数，初始化需实现
	    private identity(boolean isLive){ 
	        this.isLive=isLive; 
	    } 

	    //抽象方法，每个实例必须重写
	    public abstract String getDesc(); 
	    
	    //静态方法
	    public static void staticMethod()
	    {
	    	System.out.println("这是一个静态方法");
	    }
	   
	    //实例一般方法，可以调用成员变量
	    public void commomMethod()
		{
	    	System.out.println("这是一个普通方法: "+this.isLive);
		}
}
