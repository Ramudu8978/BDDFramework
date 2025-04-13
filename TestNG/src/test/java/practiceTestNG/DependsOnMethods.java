package practiceTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethods {
	@Test
 
	public void sample1()
	{
		System.out.println("first method");
		Assert.assertTrue(false);
	}
	@Test(dependsOnMethods="sample1")
	public void sample2()
	{
		System.out.println("second method");
	}
	@Test(dependsOnMethods= {"sample2"})
	public void sample3()
	{
		System.out.println("third method");
	}
}
