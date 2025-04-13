package practiceTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Sample {
	
	@BeforeSuite
	public void sampl1()
	{
		System.out.println("before suite");
	}
	@AfterSuite
	public void sample2()
	{
		System.out.println("after suite");
	}
	@BeforeMethod
	public void sample3()
	{
		System.out.println("before method");
		
	}
	@BeforeTest
	public void sample4()
	{
		System.out.println("before test");
	}
	@AfterMethod
	public void sample5()
	{
		System.out.println("after method");
	}
	@AfterTest
	public void sample6()
	{
		System.out.println("after test");
	}
	@AfterClass
	public void sample7()
	{
		System.out.println("after class");
	}
	@BeforeClass
      public void sample8()
      {
    	  System.out.println("before class");
      }
}
