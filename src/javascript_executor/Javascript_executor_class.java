package javascript_executor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_executor_class 
{
//java script executor commands
	public static void main(String args[])
	{
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\chand\\\\eclipse-workspace\\\\Batch\\\\Browser\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//WebElement user = driver.findElement(By.id("email"));
		//WebElement btn = driver.findElement(By.name("login"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//js.executeScript("document.getElementById('email').value='chandrak';");
		
		//js.executeScript("arguments[0].click();", btn);
		
		
		
		
		
		
		
		
		
	}
}
