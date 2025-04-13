package ramsss;

public class CountEvenOddNumber {
	public static void main(String[] args)
	{
		int a[]= {2,4,5,7,6};
		int c=0;
		int d=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				c++;
				
				
			}
			
		}
		System.out.println("even numbers:"+c);
		for(int j=0;j<a.length;j++)
		{
			if(a[j]%2!=0)
			{
				d++;
			}
		}
		System.out.println("odd numbers:"+d);
		
	}
}
	
	
			
