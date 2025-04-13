package Day2;

public class SecondSmallAndSecondlargest {
	
	public static void main(String[] args)
	{
		int a[]= {1,2,3,1,2,3,5,6,4};
		
		int smallest=Integer.MAX_VALUE;
		int largest=Integer.MAX_VALUE;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<smallest)
			{
				smallest=a[i];
			}
			
		}
		System.out.println(smallest);
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<largest && a[i]>smallest)
			{
				largest=a[i];
			}
		}
		System.out.println(largest);
		
	}


}
