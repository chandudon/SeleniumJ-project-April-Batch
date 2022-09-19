package javascript_executor;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Sample_class1 
{

	public static void main(String args[]) throws AWTException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chand\\eclipse-workspace\\Batch\\Browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		WebElement var = driver.findElement(By.xpath("//input[@id='email']"));
		
		
		//alternates for sendkeys are- robot class,actions class sendkeys,
		//javascript executor
		
		//Actions act=new Actions(driver);
		//act.sendKeys(var, "chandrakantshinde261@gmail.com").perform();
		
		
		Robot rbt=new Robot();
		
		rbt.keyPress(KeyEvent.VK_C);
		rbt.keyRelease(KeyEvent.VK_C);
		
		Thread.sleep(5000);
		rbt.keyPress(KeyEvent.VK_H);
		rbt.keyRelease(KeyEvent.VK_H);
		
		//JavascriptExecutor obj = (JavascriptExecutor)driver;
		
		//obj.executeScript("arguments[0].value='chandu'", var);
		
		//arguments[0].value='dishaa';
		
		
		driver.close();
		
		
	}
}
