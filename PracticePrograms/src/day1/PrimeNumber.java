package day1;

public class PrimeNumber {
	
	public static void main(String[] args)
	{
		
		int num=5;
		
		for(int i=2;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.println(num +":is not a primenumber");
			}
			else
			{
				System.out.println(num +":is a primenumber");
				
			
		}
		}
	}
}


