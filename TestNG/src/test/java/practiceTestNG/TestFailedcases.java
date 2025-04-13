package practiceTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFailedcases {
	@Test(retryAnalyzer=RetryFailed.class)
	public void sample()
	{
		System.out.println("this test case fails");
		Assert.assertTrue(false);
	}
	@Test
	public void sample2()
	{
		System.out.println("Sample2"+Thread.currentThread().getId());
	}
	@Test
	public void sample3()
	{
		System.out.println("sample3"+Thread.currentThread().getId());
	}
	@Test
    public void sample4()
    {
    	System.out.println("sample4"+Thread.currentThread().getId());
    }
}
