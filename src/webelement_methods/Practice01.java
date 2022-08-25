package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice01 
{

	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", 
				"D:\\softwares\\selenium and chrome driver\\chrome driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Log in with Facebook']")).click();
			Thread.sleep(2000);	
			driver.findElement(By.name("email")).sendKeys("chaandrakant");
	}
}
