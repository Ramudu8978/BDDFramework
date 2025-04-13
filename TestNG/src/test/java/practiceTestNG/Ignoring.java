package practiceTestNG;

import org.testng.annotations.Test;

public class Ignoring {
	
	@Test(invocationCount=2)
	
	public void sample()
	{
		System.out.println("not ignore this test case");
	}
	@Test(enabled=false)
	public void sample1()
	{
		System.out.println("ignore this test case");
	}

}
