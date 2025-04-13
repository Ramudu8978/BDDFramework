package day1;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {
	public static void main(String[] args)
	{
		//{'A':5,'G':{'E':10,'B':20},'F':100,'S':90}
		
		Map<Character,Integer> map=new HashMap<>();
		
		map.put('A', 5);
		map.put('F', 100);
		map.put('S', 90);
		map.put('G', ns);
		
		
		//For nestedmap
		 Map<Character,Object> ns=new HashMap<>();
		  ns.put('E',10);
		  ns.put('B', 20);
		  
		  
	}

}
