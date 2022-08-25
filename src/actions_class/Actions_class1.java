package actions_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_class1 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\chand\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement source_user = driver.findElement(By.xpath("//input[contains(@class,'_2IX_2- VJ')]"));
		WebElement login = driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2HKl')]"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(source_user).sendKeys("chandrakantshinde261@gmail.com").build().perform();
		act.moveToElement(login).click().build().perform();
	}
}
