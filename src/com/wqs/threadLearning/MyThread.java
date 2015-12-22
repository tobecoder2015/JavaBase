package com.wqs.threadLearning;

public class MyThread extends Thread{

	int count=1,number;

	public MyThread(int num) {
		number=num;
		System.out.println("创建线程： "+number);
		// TODO Auto-generated constructor stub
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		while (true) {
			System.out.println("线程 "+number+" :计数 "+count);
			if(++count==6)
			{
				System.out.println("线程 "+number+" 结束运行");
				return ;
			}
			
				
		}
		
	}

	

}
