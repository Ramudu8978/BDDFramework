package Day2;

abstract class Vehicle {
	
	abstract void start();
	
	abstract void stop();
//	{
//		System.out.println("vehicle stop");
//	}
	

}
class Car extends Vehicle
{
	void start()
	{
		System.out.println("car will staart");
	
}
	void stop()
	{
		System.out.println("vehicle stop");
	}
}
public class AbstractionExample{
public static void main(String[] args)
{
	Vehicle v=new Car();
	v.start();
	v.stop();
}
}



