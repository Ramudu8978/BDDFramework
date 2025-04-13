package Day2;

import java.util.Scanner;

public class FactorialOfgivenNumber {
	
	public static void main(String[] args)
	{
		int fact=1;
//		Scanner sc=new Scanner(System.in);
//		System.out.print("Enter a number:");
//		int num=sc.nextInt();
		
		for(int i=1;i<=5;i++)
		{
			fact=fact*i;
		}
		System.out.println("fact of given number is:"+fact);
		
	}

}
