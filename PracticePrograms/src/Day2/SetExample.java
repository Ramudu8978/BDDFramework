package Day2;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
	public static void main(String[] args)
	{
	   Set<String> s=new HashSet<String>();
	   
	   s.add("apple");
	   s.add("banana");
	   s.add("apple");
	   s.add("orange");
	   System.out.println(s);
	   
	}

}
