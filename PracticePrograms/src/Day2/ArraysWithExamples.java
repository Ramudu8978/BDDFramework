package Day2;

import java.util.HashSet;

public class ArraysWithExamples {
	public static void main(String[] args)
	{
		//Length of the array
		int a[]= {1,2,3,4,5,1,2,2,1};
		
		String []s= {"ram","raj","rockey"};
		
		System.out.println(a.length);
		System.out.println(s.length);
		
		//Remove Duplicate Elements from Array
		HashSet<Integer> set=new HashSet<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}
		System.out.println(set);
		
		//First Element Move Left
		
		int b[]= {1,2,3,4,5};
		
		int first=b[0];
		
		
		for(int i=0;i<b.length;i++)
		{
			b[i]=b[i+1];
		}
		b[b.length-1]=first;
		
		for(int num: b)
		{
			System.out.print(num);
			
			
			//Last to First
			
			int c[]= {1,2,3,4,5};
			 
			int n1=c[4];
			
			for(int i=0;i<c.length;i++)
			{
				c[i]=c[i];
			}
			c[0]=n1;
			
			for(int n2: c)
			{
				System.out.println(n2);
			}
		
		}
		
		
		
		
	}
	


}
