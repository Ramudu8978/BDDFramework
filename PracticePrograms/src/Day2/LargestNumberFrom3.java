package Day2;

public class LargestNumberFrom3 {
	public static void main(String[] args)
	{
		int n1=10,n2=20,n3=30;
		
		if(n1>n2 && n1>n3)
		{
			System.out.println("n1 is larger number");
		}
		else if(n2>n1 && n2>n3)
		{
			System.out.println("n2 is large");
		}
		else
		{
			System.out.println("n3 is lagre");
		}
	}

}
