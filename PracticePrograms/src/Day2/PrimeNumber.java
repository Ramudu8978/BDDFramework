package Day2;

public class PrimeNumber {
	public static void main(String[] args)
	{
		int num=11;
		int count=0;
		
		for(int i=2;i<num/2;i++)
		{
			
			if(num%i==0)
			{
				count++;
			
		}
		}
		if(count>1)
		{
			System.out.println("not a prime number");
		}
		else
		{
			System.out.println("prime number");
		}
		}

	}


