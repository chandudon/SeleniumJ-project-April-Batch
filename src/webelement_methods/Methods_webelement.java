package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Methods_webelement 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", 
				"D:\\softwares\\selenium and chrome driver\\chrome driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(3000);
		
		WebElement var = driver.findElement(By.name("birthday_day"));
		
		Select c=new Select(var);
		c.selectByIndex(12);
		
		WebElement var2 = driver.findElement(By.name("birthday_month"));
		
		Select c1=new Select(var2);
		//c1.selectByIndex(7);
		c1.selectByValue("8");
		
		WebElement var3 = driver.findElement(By.name("birthday_year"));
		
		Select c2=new Select(var3);
		c2.selectByValue("2018");
		Thread.sleep(3000);
		c2.selectByVisibleText("2019");
		Thread.sleep(3000);
		c2.selectByIndex(9);
		
		
		
		
	}
}
