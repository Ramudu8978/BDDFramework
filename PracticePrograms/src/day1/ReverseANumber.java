package day1;

public class ReverseANumber {
	
	public static void main(String[] args)
	{
		int n=123,a=0;
		
		while(n!=0)
		{
			n=n%10;
			a=a*10+n;
			n=n/10;
			
			
		}
		System.out.println(a);
		
	}

}
