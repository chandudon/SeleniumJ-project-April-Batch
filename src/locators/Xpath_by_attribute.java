package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_by_attribute 
{

	public static void main(String[] args) throws InterruptedException
	{
	
		//locator - xpath by attribute
		System.setProperty("webdriver.chrome.driver", 
				"D:\\softwares\\selenium and chrome driver\\chrome driver\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//syntax for locator xpath
		WebElement un = driver.findElement(By.xpath("//input[@name='email']"));
		un.sendKeys("chandrakant");
		
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Rahul@123");
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		
		
		
		
		
		
		
		
	}
}
