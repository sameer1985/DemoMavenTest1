package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basedemo.BaseClass;

public class DemoLoginPage extends BaseClass {
	
	public DemoLoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[contains(@placeholder,'First Name')]")
	WebElement txtFirstname;
	@FindBy(xpath="//input[contains(@placeholder,'Last Name')]")
	WebElement txtLastName;
	@FindBy(xpath="//textarea[@ng-model='Adress']")
	WebElement txtAddress;
	
	
	public void FirstName(String FirstName)
	{
		txtFirstname.sendKeys(FirstName);
	}
	
	public void LastName(String LastName)
	{
		txtLastName.sendKeys(LastName);
	}
	
	public void Address(String Address)
	{
		txtAddress.sendKeys(Address);
	}
	

}
