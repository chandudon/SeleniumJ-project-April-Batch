package dynamic_elements_handlling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1
{
//handling dynamic element
	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\chand\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("oppo mobiles");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		WebElement reviews = driver.findElement(By.xpath("((//span[@class='_2_R_DZ'])[1]//span)[4]"));
		WebElement ratings = driver.findElement(By.xpath("((//span[@class='_2_R_DZ'])[1]//span)[2]"));
		WebElement reviews_and_ratings = driver.findElement(By.xpath("((//span[@class='_2_R_DZ'])[1]//span)[1]"));
		
		System.out.println(reviews.getText());
		System.out.println(ratings.getText());
		System.out.println(reviews_and_ratings.getText());
		
	}
}
