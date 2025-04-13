package ramsss;

public class ReverseArray {
	public static void main(String[] args)
	{
		int a[]= {1,2,3,4,5};
		int rev=0;
		for(int i=a.length-1;i>=0;i--)
		{
			if(a[i]>=0)
			{
				rev=a[i];
				
			}
			System.out.print(rev);
		}
	}

}
