package PageObjectModelPOM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass 
{

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\chand\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		FacebookLogInPage obj=new FacebookLogInPage(driver);
		
		
		obj.username();
		obj.password();
		//obj.loginbutton();
		obj.createnewaccount();
		
		FacebookSignUp obj2=new FacebookSignUp(driver);
		obj2.firstname();
		obj2.Lastname();
		
		
		
		
	}
}
