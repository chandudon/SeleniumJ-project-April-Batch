package webelement_methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_class
{

	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", 
				"D:\\softwares\\selenium and chrome driver\\chrome driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		//driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(3000);
		
		WebElement var1 = driver.findElement(By.name("birthday_day"));
		
		Select c=new Select(var1);
		Thread.sleep(3000);
		
		WebElement var2 = driver.findElement(By.name("birthday_month"));
	
		Select c1=new Select(var2);
		Thread.sleep(3000);
		WebElement var3 = driver.findElement(By.name("birthday_year"));
		
		Select c2=new Select(var3);
		List<WebElement> l = c.getOptions();
		List<WebElement> l1 = c1.getOptions();
		List<WebElement> l2 = c2.getOptions();
		int size = l.size();
		int size1=l1.size();
		int size2=l2.size();
		System.out.println("size of dates list : "+size);
		System.out.println("size of months list : "+size1);
		System.out.println("size of year list : "+size2);
		
	}
}
