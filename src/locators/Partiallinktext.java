package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Partiallinktext 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", 
				"D:\\softwares\\selenium and chrome driver\\chrome driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//1.get method => it is used to pass url
			driver.get("https://www.facebook.com/");
			
			Thread.sleep(2000);
			
			driver.manage().window().maximize();
			
			driver.findElement(By.partialLinkText("Forgotten pas")).click();
			
	}
}
