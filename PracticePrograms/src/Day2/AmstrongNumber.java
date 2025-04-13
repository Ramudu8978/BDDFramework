 package Day2;

import java.util.Scanner;

public class AmstrongNumber {
	public static void main(String[] args)
	{
		int sum=0,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		while(num!=0)
		{
			n=num%10;
			sum=sum+(n*n*n);
			num=num/10;
		
	}
		System.out.println(sum);
		{

		if(num==sum)
		{
			System.out.println("amstrong number");
		}
		else
		{
			System.out.println("not a amstrong number");
		}
	}
	
	}

}
