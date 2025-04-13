package Day2;

public class StringBilder {
	public static void main(String[] args)
	{
		String name="welcome";
		
//		StringBuilder input=new StringBuilder();
//		input.append(name);
//		input.reverse();
//		System.out.println("reverse string is:"+input);
		
		StringBuffer input=new StringBuffer(name);
		input.reverse();
		System.out.println(input);
	}

}
