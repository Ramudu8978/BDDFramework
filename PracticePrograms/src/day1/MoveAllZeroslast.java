package day1;

import java.util.Arrays;

public class MoveAllZeroslast {
	public static void main(String[] args)
	{
		int a[]= {0,3,2,0,1,5,6,0};
		
		int index=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				a[index]=a[i];
				index++;
			}
		}
		while(index<a.length)
		{
			a[index]=0;
			index++;
		}
		System.out.println(Arrays.toString(a));
	}

}
