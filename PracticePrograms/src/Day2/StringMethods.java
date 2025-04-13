package Day2;

public class StringMethods {
	public static void main(String[] args)
	{
		String s1="kambagiri";
		String s2="ramudu";
		
		String s=s1.concat(s2);
		System.out.println(s.charAt(0));
		System.out.println(s.codePointAt(0));
		System.out.println(s.compareTo(s1));
		System.out.println(s.substring(1, 5));
		System.out.println(s.replace("a", "A"));
		boolean isequal=s.equals(s1);
		System.out.println(isequal);
	}

}
