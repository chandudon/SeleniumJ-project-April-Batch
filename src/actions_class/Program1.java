package actions_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Program1 
{

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver",
				"");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).submit();
		WebDriverWait wait=new WebDriverWait(driver, 20);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='firstname']"))).sendKeys("chandrakant");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='lastname']"))).sendKeys("shinde");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(""))).submit();
		
	}
}
