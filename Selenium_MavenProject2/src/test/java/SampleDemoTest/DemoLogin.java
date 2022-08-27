package SampleDemoTest;

import org.testng.annotations.Test;
import basedemo.BaseClass;

public class DemoLogin extends BaseClass  {
	
	@Test

public void test()
	{
		demologinpage.FirstName("Sameer");
		demologinpage.LastName("Shaik");
		demologinpage.Address("test123");
		
	}
	
			
			
			
			
}