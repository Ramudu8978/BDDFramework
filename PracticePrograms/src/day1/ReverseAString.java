package day1;

public class ReverseAString {
	public static void main(String[] args)
	{
		String s="kambagiriramudu";
		String rev=" ";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("string is:"+rev);
		
	}
	

}
