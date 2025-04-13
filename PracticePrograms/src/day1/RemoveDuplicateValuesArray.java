package day1;

import java.util.LinkedHashSet;

public class RemoveDuplicateValuesArray {
	public static void main(String[] arg)
	{
		int a[]= {1,2,3,1,2,2,4,5};
//		
//		remove(a);
//		
//	}
//
//	public static void remove(int[] a) {
		LinkedHashSet<Integer> s=new LinkedHashSet<Integer>();
		
		for(int i=0;i<=a.length;i++)
		{
			s.add(a[i]);
		
			
			System.out.println(s);
		

}
}
}
