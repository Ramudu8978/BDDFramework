package ramsss;
import java.io.*;

public class FindSmallAndLargestNum {
	


	public static void main(String[] args) 
	{
		
		int small=0;
		int secondL=0;
		int a[]= {5,1,3,2,4};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>small)
			{
				small=a[i];
			}
		}
		System.out.println("smallest value:"+small);
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>secondL && a[i]<small)
			{
				secondL=a[i];
			}
		}
		System.out.println("secondlarge:"+secondL);
	}
}