package Day2;

public class NonStaticMethod {
	public void display()
	{
		System.out.println("it is Non-Static methods");
	}
	public static void main(String[] args)
	{
		NonStaticMethod n=new NonStaticMethod();
		n.display();
	}

}
