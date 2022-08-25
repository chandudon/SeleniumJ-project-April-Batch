package PageObjectModelPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLogInPage
{

	@FindBy(xpath="//input[@name='email']") private WebElement UN;
	@FindBy(xpath="//input[@name='pass']") private WebElement pass;
	@FindBy(xpath="//button[@name='login']") private WebElement login;
	@FindBy(xpath="//a[contains(@id,'u_0')]") private WebElement newaccount;
	
	public FacebookLogInPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void username()
	{
		UN.sendKeys("vishalbhau");
	}
	public void password()
	{
		pass.sendKeys("chandrakant");
	}
	
	public void loginbutton()
	{
		login.click();
	}
	public void createnewaccount()
	{
		newaccount.click();
	}
	
	
}
