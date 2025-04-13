package Day2;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
	public static void main(String[] args)
	{
		List<String> list=new ArrayList<String>();
		list.add("apple");
		list.add("orange");
		list.add("banana");
		list.remove(0);
		list.remove(1);
		list.add("lemon");
		System.out.println(list);
		System.out.println(list.get(0));
	}

}
