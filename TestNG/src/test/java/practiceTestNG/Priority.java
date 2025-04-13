package practiceTestNG;

import org.testng.annotations.Test;

public class Priority {
	
	@Test(priority=2)
	public void sample()
	{
		System.out.println("Automation BBB");
	}
	@Test(priority=1)
	public void sample1()
	{
		System.out.println("Automation AAA");
	}
	@Test(priority=3)
	public void sample3()
	{
		System.out.println("ram automation");
	}

}
