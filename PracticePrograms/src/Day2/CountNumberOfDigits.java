package Day2;

import java.util.Scanner;

public class CountNumberOfDigits {
	public static void main(String[] args)
	{
		int n,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int num=sc.nextInt();
		while(num!=0)
		{
			num=num/10;
			count++;
			}
	System.out.println(count);
	}

}
