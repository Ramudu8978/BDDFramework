package Day2;

public class DuplicateCharInString {
	public static void main(String[] args)
	{
		String s="kambagiri";
		int c=0;
		
		char[] input=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(input[i]==input[j])
				{
					c++;
					System.out.println(input[j]);
					
					
					break;
				}
			}
		}
	}

}
