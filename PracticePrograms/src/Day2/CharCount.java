package Day2;
public class CharCount {
	public static void main(String[] args)
	{
		String str="hello world";
		char c='l';
		
		int count=0;
		
		for(char ch: str.toCharArray())
		{
			if(c==ch)
			{
				count++;
			}
		}
		System.out.println("l count is:"+count);
	}
	
}