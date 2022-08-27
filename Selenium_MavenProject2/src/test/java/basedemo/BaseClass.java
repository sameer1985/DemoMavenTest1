package basedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pageObjects.DemoLoginPage;

public class BaseClass {
	
	
	public static WebDriver driver;
	public DemoLoginPage demologinpage;
	
	@BeforeMethod
	public void setup()
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\seleniumWebDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		demologinpage=new DemoLoginPage();
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}
	

}
