package com.wqs.container;

import java.awt.List;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Contianer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Collection<String> list=new LinkedList<String>();
//		for(int i=0;i<10;i++)
//		list.add(String.valueOf(i));
//		
//		Iterator<String> iterator=list.iterator();
		
		Collection<Point> c=new LinkedHashSet<Point>();
		
		for(int i=0;i<10;i++)
		{
			c.add(new Point(i,i+1));
		}
		
		Iterator<Point> iterator=c.iterator();
		
		while(iterator.hasNext())
		{
			Point p=(Point)iterator.next();
			System.out.println("X:"+p.x+" Y:"+p.y);
			
		}

	}

}



