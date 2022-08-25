package testNG;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations1 
{

	WebDriver driver;
	@BeforeClass
	public void OpenBrowser()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\chand\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	
	@BeforeMethod
	public void login() throws InterruptedException
	{
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("9657600339");
		
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("rahul@123");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
	}
	@Test
	public void friends()
	{
		
		driver.findElement(By.xpath("(//span[@class='l9j0dhe7'])[2]")).click();
		
	}
	
//	@Test
//	public void groups()
//	{
//		driver.findElement(By.xpath("(//span[@class='l9j0dhe7'])[5]")).click();
//	}
	
	@AfterMethod
	public void logout() throws InterruptedException
	{
		
		driver.findElement(By.xpath("(//div[@class='q9uorilb l9j0dhe7 pzggbiyp du4w35lb'])[1]")).click();
		
		driver.findElement(By.xpath("//span[text()='Log Out']")).click();
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
	
}
