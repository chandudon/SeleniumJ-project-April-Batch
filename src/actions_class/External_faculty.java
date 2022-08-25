package actions_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class External_faculty 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\chand\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		
		driver.get("");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
		
	}
	
}
