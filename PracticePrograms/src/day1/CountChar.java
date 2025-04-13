package day1;

import java.util.HashMap;
import java.util.Map;

public class CountChar {
	public static void main(String[] args)
	{
		String s="kambagiri";
		HashMap<Character,Integer> count=new HashMap<>();
		for(char ch:s.toCharArray())
		{
			if(count.containsKey(ch))
			{
				count.put(ch, count.get(ch)+1);
				
			}
			else
			{
				count.put(ch, 1);
			}
		}
			for(Map.Entry<Character, Integer> e: count.entrySet())
			{
				System.out.print(e.getKey() +""+e.getValue());
				
			}
		}
		
		
	
}


