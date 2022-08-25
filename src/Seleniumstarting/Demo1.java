package Seleniumstarting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", 
				"D:\\softwares\\selenium and chrome driver\\chrome driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6')]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("shoes");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button")).click();
		
	}
}
