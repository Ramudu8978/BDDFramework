package day1;

public class CalculateSumOfDigits {
	public static void main(String[] args)
	{
		int n=12345,sum=0;
		
		while(n>0)
		{
			sum=sum+n%10;
			n=n/10;
		}
		System.out.println("sum of given number:"+sum);
		
	}

}
