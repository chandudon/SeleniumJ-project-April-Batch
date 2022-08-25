package PageObjectModelPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InstagramSignIn 
{

	@FindBy(xpath="//input[@name='username']") private WebElement User;
	@FindBy(xpath="//input[@name='password']") private WebElement Password;
	@FindBy(xpath="//span[text()='Sign up']") private WebElement SignUp;
	
	public InstagramSignIn(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void getuser(String username)
	{
		User.sendKeys(username);
	}
	
	public void getpassword(String password)
	{
		Password.sendKeys(password);
	}
	public void SignUppage()
	{
		SignUp.click();
	}
}
