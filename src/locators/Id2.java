package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id2 
{

public static void main(String[] args) throws Throwable 
{

	System.setProperty("webdriver.chrome.driver", 
			"D:\\softwares\\selenium and chrome driver\\chrome driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	//1.get method => it is used to pass url
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("chandu");
		driver.findElement(By.id("pass")).sendKeys("Rahul@1234");
		
}
}
