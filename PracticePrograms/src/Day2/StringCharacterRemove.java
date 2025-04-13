package Day2;

public class StringCharacterRemove {
	public static void main(String[] args)
	{
		String str="Kambagiri?";
		char newstr='?';
		char replace=' ';
		
		/*
		 * String s=str.replace("?", ""); System.out.println(s);
		 */
//		
//		StringBuilder sb= new StringBuilder();
//		for(int i=0; i<str.length();i++) {
//			if(str.charAt(i)==newstr) {
//				sb.append(replace);
//			}else {
//                sb.append(str.charAt(i));
//            }
//			
//		}
//		 String newStr = sb.toString();
//		System.out.println(newStr); 
//		System.out.println("nvbdfbgj");
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			
			if(Character.isLetterOrDigit(ch))
			{
				System.out.print(ch);
			}
		}
//		
	}

}
