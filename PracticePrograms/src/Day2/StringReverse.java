package Day2;

import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args)
	{
		String rev="";
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a name:");
		String name=sc.nextLine();
		
		
		for(int i=name.length()-1;i>=0;i--)
		{
			 rev=rev+name.charAt(i);
			 
		}
		System.out.println("reverse String is:"+rev);
		
		String s=rev.charAt(0)+" "+rev.substring(1, 3)+" "+rev.substring(3, 9);
		System.out.println(s);
		
		
	}

}
