package com.wqs.fileTest;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		File file=new File("D:/view.avi");
//		System.out.println(file.getAbsolutePath());
//		System.out.println(file.exists());
//		System.out.println(file.isDirectory());
//		System.out.println(file.getParent());
//		System.out.println(file.getName());
//		System.out.println(file.canRead());
//		System.out.println(file.canExecute());
		File file=new File("E:\\娱乐\\记录片");
		
		fileListView(file,0);
		

//		try
//		{
//			Runtime pro=Runtime.getRuntime();
//		
//			pro.exec("C:\\Program Files (x86)\\Baofeng\\StormPlayer\\BaofengPlatform.exe  D:\\view.avi" );
//			
//			
//			}//程序所在的位置
//		catch(Exception ee)
//		{
//			ee.printStackTrace();
//		}
	}
	
	public static void fileListView(File path,int k)
	{
		File[] fileList=path.listFiles();
		for(File file :fileList)
		{
			if(file.isFile())
			{
				for(int i=0;i<k;i++)
					System.out.print("  ");
				System.out.println(file.getName());
			}
			
			else
			{
				for(int i=0;i<k;i++)
					System.out.print("  ");
				System.out.println(file.getName());
				fileListView(file,k+6);
						
			}
			
		}
		
			

			
		
		
		
	}

}
