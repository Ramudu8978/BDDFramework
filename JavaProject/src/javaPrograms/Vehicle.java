package javaPrograms;

abstract class Vehicle {
	abstract void start();//no method body
	
}
class Bike extends Vehicle
{ 
	void start()
	{
		System.out.println("bike will start");
	}
	public static void main(String[] args)
	{
		Vehicle v=new Bike();
		v.start();
	}
	
}
