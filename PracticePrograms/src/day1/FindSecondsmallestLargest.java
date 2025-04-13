package day1;

public class FindSecondsmallestLargest {
public static void main(String[][] args)
{
	int smallest=Integer.MAX_VALUE;
	int second=Integer.MAX_VALUE;
	int a[]= {1,2,1,4,5,2,3};
	
	for(int i=0;i<a.length;i++)
	{
		if(a[i]<smallest)
		{
			smallest=a[i];
		}
		System.out.println(smallest);
		
	}

	for(int i=0;i<a.length;i++)
	{
		
		if(a[i]<second && a[i]>smallest)
		{
			second=a[i];
		}
	}
	
}
}



