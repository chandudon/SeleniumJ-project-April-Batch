package actions_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_class2 
{

	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\chand\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement source1 = driver.findElement(By.xpath("//li[@id='credit2']"));
		WebElement source2 = driver.findElement(By.xpath("(//li[@id='fourth'])[2]"));
		WebElement source3 = driver.findElement(By.xpath("//li[@id='credit1']"));
		WebElement source4 = driver.findElement(By.xpath("(//li[@id='fourth'])[1]"));
		
		WebElement dest1 = driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[2]"));
		WebElement dest2 = driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[3]"));
		WebElement dest3 = driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[4]"));
		WebElement dest4 = driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[5]"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(source1).clickAndHold().moveToElement(dest1).release().build().perform();
		act.moveToElement(source2).clickAndHold().moveToElement(dest2).release().build().perform();
		
		act.dragAndDrop(source3, dest3).perform();
		act.dragAndDrop(source4, dest4).perform();
	}
}
