package com.wqs.threadLearning;

public class MyThread2 implements Runnable {

	

	int count=1,number;
	
	public  MyThread2(int num) {
		// TODO Auto-generated constructor stub
		number=num;
		System.out.println("创建线程"+number);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			System.out.println("线程"+number+": 计数 "+count);
			if(++count==6)
			{
				System.out.println("线程 "+number+" 结束运行");
				return ;
			}
		}

	}

}
