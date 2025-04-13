package Day2;

import java.util.LinkedHashSet;

public class RemoveDuplicatevalues {
	
	public static void main(String[] args)
	{
		int a[]= {1,2,3,1,2,4,5,3};
		LinkedHashSet<Integer> list=new LinkedHashSet<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			list.add(a[i]);
		
		
		}
		System.out.println(list);  
	}
	

}
