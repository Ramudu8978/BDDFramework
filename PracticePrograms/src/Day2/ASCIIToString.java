package Day2;

public class ASCIIToString {
	public static void main(String[] args)
	{
		int a[]= {65, 120, 98, 75, 115};
		String str=null;
		
		for(int i:a)
		{
			str=Character.toString((char)i);
			System.out.print(str+",");
			
		}
	}

}
