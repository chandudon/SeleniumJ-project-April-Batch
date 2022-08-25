package PageObjectModelPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookSignUp 
{

	@FindBy(xpath="//input[@name='firstname']") private WebElement FN; 
	@FindBy(xpath="//input[@name='lastname']") private WebElement LN;
	
	public FacebookSignUp(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void firstname()
	{
		FN.sendKeys("chandrakant");
	}
	public void Lastname()
	{
		LN.sendKeys("shinde");
	}
}
