package Day2;

import java.util.ArrayList;
import java.util.List;

public class CommonElementsInArray {
	public static void main(String[] args)
	{
		int a[]= {1,2,3,4};
		int b[]= {4,2,5,6};
		 
		List<Integer> commonElements=new ArrayList<>();
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					commonElements.add(a[i]);
				}
			}
		}
		System.out.println(commonElements);
	}

}
