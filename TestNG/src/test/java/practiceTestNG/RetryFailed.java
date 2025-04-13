package practiceTestNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailed implements IRetryAnalyzer {
	private int retryCount=1;
	private int retryMaxCount=3;
	
	@Override
	public boolean retry(ITestResult arg0)
	{
		if(retryCount<retryMaxCount)
		{
			retryCount++;
		return true;
	}
	return false;
	
}
}
