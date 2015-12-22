package com.wqs.threadLearning;

public class Main {
	
	public static void main(String[] args) {

		for(int i=0;i<5;i++){
			new MyThread(i+1).start();
		}

	}

}
