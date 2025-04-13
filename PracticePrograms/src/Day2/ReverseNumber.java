package Day2;

public class ReverseNumber {
	public static void main(String[] args)
	{
		int num=151,rev=0,n;
		
		while(num!=0)
		{
			n=num%10;
			rev=rev*10+n;
			num=num/10;
			
			
		}
	
	
		System.out.println(rev);
		


	     if(num==rev)
		{
			System.out.println("palindrome");
		}
		else 
		{
			System.out.println("not a palindrome");
		}
	}
	
}
	




	
