package PageObjectModelPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InstagramSignUp 
{

	@FindBy(xpath="//input[@name='emailOrPhone']") private WebElement MobileNo;
	@FindBy(xpath="//input[@name='fullName']") private WebElement FullName;
	@FindBy(xpath="//input[@name='password']") private WebElement InstaPassword;
	
	
	public InstagramSignUp(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void getMobile( double insta_mobile)
	{
		MobileNo.sendKeys(String.valueOf(insta_mobile));
	}
	public void getFullName(String fullname)
	{
		FullName.sendKeys(fullname);
	}
	
	public void getPassword(String password)
	{
		
	InstaPassword.sendKeys(password);	
	
	}
}
