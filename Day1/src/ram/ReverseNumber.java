package ram;

public class ReverseNumber {
	public static void main(String[] args)
	{
		int n=1234;
		int a=0;
		int rev;
		
		while(n!=0)
		{
			rev=n%10;
			a=a*10+rev;
			n=n/10;
			
		}
		System.out.println("value of a is:"+a);
	}

}
