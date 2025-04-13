package Day2;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args)
	{
		int sum=0;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter a number:");
			int num=sc.nextInt();
			while(num!=0)
			{
				sum=sum+num%10;
				num=num/10;
				
			}
		}
		System.out.println("Sum of given number:"+" "+sum);
		
	}

}
