package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id 
{

	public static void main(String[] args) throws Throwable
	{
	
		System.setProperty("webdriver.chrome.driver", 
				"D:\\softwares\\selenium and chrome driver\\chrome driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//1.get method => it is used to pass url
			driver.get("file:///C:/Users/chand/Desktop/New%20folder/practice1.html");
			
			Thread.sleep(2000);
			
			driver.manage().window().maximize();
			
			driver.findElement(By.id("abc")).sendKeys("chandu");
			driver.findElement(By.id("123")).sendKeys("Rahul@1234");
			driver.findElement(By.id("123")).click();
			
		
	}
}
