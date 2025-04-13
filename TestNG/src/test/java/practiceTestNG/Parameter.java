package practiceTestNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class Parameter {
	@Test()
	@Parameters({"username","password"})
	public void sample1(@Optional("rams")String username,String password)
	{
		System.out.println("username:"+username);
		System.out.println("password:"+password);
		
		
	}
	@Test
	
	@Parameters({"username","password"})
	
	public void sample2(String username,String password)
	{
		System.out.println("username:"+username);
		System.out.println("password:"+password);
	}

}
