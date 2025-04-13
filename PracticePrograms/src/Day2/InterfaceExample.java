package Day2;

interface Animal {
	
	void dog();
	
	

}

class Dog implements Animal
{
	public void dog()
	{
		System.out.println("dog barking");
	}
	
}
public class InterfaceExample
{
	public static void main(String[] args)
	{
		Animal a=new Dog();
		a.dog();
	}
}
