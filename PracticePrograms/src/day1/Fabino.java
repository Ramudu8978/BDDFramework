package day1;

import java.util.Scanner;

public class Fabino {
	public static void main(String[] args)
	{
		int first=0,sec=1,next;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		
		for(int i=0;i<=num;i++)
		{
			next=sec+first;
			first=sec;
			sec=next;
			
			System.out.print(next);
		}
		
	}
	;

}
