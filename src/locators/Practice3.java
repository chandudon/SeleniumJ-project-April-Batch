package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice3
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver",
				"D:\\softwares\\selenium and chrome driver\\chrome driver\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://signup.zerodha.com/");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input")).sendKeys("9456251254");
		
		//tagname[text()='value']  --- xpath by text 
		//tagname[@attribute='value']
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Want to open an NRI account?']")).click();
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()=' Logout ']")).click();
		
	}
}
