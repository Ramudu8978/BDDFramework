package Day2;

public class MissingElement {
	
	public static void main(String[] args)
	{
		int sum1=0;
		int sum2=0;
		
		int a[]= {1,2,4,5,6,8};
		
		for(int i=0;i<a.length;i++)
		{
			sum1=sum1+a[i];
		}
		System.out.println(sum1);
	
	for(int i=1;i<=8;i++)
	{
		sum2=sum2+i;
	}
	System.out.println(sum2);
	System.out.println("missing element:"+(sum2-sum1));
	}
}
