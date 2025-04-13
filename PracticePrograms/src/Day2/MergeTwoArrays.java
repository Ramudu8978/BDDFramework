package Day2;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoArrays {
	public static void main(String[] args)
	{
		char c[]= {'a','b','c'};
		int a[]= {1,2,3};
		
		List<Object> merged=new ArrayList<>();
		
		for(int i=0;i<c.length;i++)
		{
			merged.add(c[i]);
			merged.add(a[i]);
		}
		System.out.println(merged);
	}

}
