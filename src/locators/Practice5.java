package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice5 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver",
				"D:\\softwares\\selenium and chrome driver\\chrome driver\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.instagram.com/?hl=en");
		
		Thread.sleep(5000);
		
		WebElement phone = driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));
		
		phone.sendKeys("9764816424");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Rahul@96");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Log In']")).click();
		
		
		
		
	}
}
