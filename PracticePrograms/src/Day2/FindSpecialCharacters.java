package Day2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindSpecialCharacters {
	public static void main(String[] args)
	{
		String input="Hello@World#2025!";
//		Pattern pattern=Pattern.compile("[^a-zA-Z0-9\\\\s]");
//		Matcher matcher=pattern.matcher(input);
//		
//		while(matcher.find()) {
//		
//		System.out.println(matcher.group());
//	}
//	}
		for(int i=0;i<input.length();i++)
		{
			char ch=input.charAt(i);
			
			if(!Character.isLetterOrDigit(ch))
			{
				System.out.print(ch+",");
			}
		}

}
}
