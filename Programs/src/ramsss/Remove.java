package ramsss;

import java.util.LinkedHashSet;

public class Remove {
	public static void remove(int a[])
	{
		LinkedHashSet<Integer> s=new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++)
		 s.add(a[i]);
		System.out.println("after removing duplicate value:"+s);
	}
	
	public static void main(String[] args)
	{
		int a[]= {1,1,2,3,4,5,3,4};
		remove(a);
	}

}
