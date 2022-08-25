package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\softwares\\selenium and chrome driver\\chrome driver\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		
		//locators --- tagname id classname name linktext partiallinktest   xpath
		//xpath --- xpath by attribute  
					//xpath by text
					//xpath by contains
		
		
		//xpath by attribute---   //tagname[@attrubute='value']
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("chandrakant");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
		
		
		
	}
}
