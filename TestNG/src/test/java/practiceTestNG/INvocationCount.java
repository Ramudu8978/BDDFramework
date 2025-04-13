package practiceTestNG;

import org.testng.annotations.Test;

public class INvocationCount {
	
	@Test(invocationCount=5)
	
	public void sample()
	{
		
		System.out.println("rockey bhaiiii");
	}
	@Test
	public void sample1()
	{
		
		System.out.println("rammmmmmm");
	}

}
