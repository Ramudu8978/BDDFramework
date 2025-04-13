package day1;

public class AmstrongNumber {
	public static void main(String[] args)
	{
		int n=153,n1=0,a;
		
		while(n!=0)
		{
			a=n%10;
			n=n/10;
			n1=n1+a*a*a;
			
		}
	
		if(n1==n)
		{
			System.out.println("amstrong number");
		}
		else
		{
			System.out.println("not a amstrong number");
		}
	}

}

