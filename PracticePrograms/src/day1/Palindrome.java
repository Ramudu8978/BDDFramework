package day1;

public class Palindrome {
	public static void main(String[] args)
	{
		int n=121,n1=0,a,rev;
		
		while(n!=0)
		{
			a=n%10;
			n1=n1*10+a;
			n=n/10;
			
		}
		System.out.println("palindrome number:"+n1);
	}

}
