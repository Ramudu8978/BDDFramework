package restAPI;
import org.testng.annotations.DataProvider;

public class TestDataProvider {
	
	@DataProvider(name="userdata")
	public static Object[][] getdata()
	{
		return new Object[][]
				{
			{"user1","password1"},
			{"user2","password"},
			{"user3","password"}
				
			
				};
	}

}
	
