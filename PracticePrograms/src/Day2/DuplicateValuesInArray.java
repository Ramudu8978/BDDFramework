package Day2;

import java.util.HashSet;

public class DuplicateValuesInArray {
	public static void main(String[] args)
	{
		int a[]= {1,2,3,1,3,4,5,2};
		HashSet<Integer> dup=new HashSet<Integer>();
		HashSet<Integer> seen=new HashSet<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			if(!seen.add(a[i]))
			{
			dup.add(a[i]);
		}
	
	}
		System.out.println(dup);
	}

}
