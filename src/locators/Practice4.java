package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice4 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver",
				"D:\\softwares\\selenium and chrome driver\\chrome driver\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2doB4z')]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[contains(text(),\"Travel\")]")).click();
		
		driver.close();
		
		
		
		
		//contains --- attribute ---> //tagname[contains(@attribute,"value")] 
		//contains ---- text    --->  //tagname[contains(text(),"value")]
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
