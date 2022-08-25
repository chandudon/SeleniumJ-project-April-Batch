package webelement_methods;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_list 
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
		Thread.sleep(3000);
		c.selectByIndex(12);
		c1.selectByIndex(3);
		c2.selectByIndex(26);
		
		
		List<WebElement> v1 = c.getOptions();
		List<WebElement> v2 = c1.getOptions();
		List<WebElement> v3 = c2.getOptions();
		
//		for(WebElement o1:v1)
//		{
//		System.out.println(o1.getText());
//		}
//		
//		for(int i=0;i<=v2.size()-1;i++)
//		{
//			 WebElement z = v2.get(i);
//			System.out.println(z.getText());
//		}
//		
//		ArrayList a1=new ArrayList();
//		TreeSet t=new TreeSet();
//		
//		for(WebElement obj:v1)
//		{
//			String str = obj.getText();
//			a1.add(str);
//			t.add(str);
//		}
//		
//		for(Object variable:a1)
//		{
//			System.out.println(variable);
//		}
//		
//		System.out.println("*******************************************");
//		
//		for(Object variable1:t)
//		{
//			System.out.println(variable1);
//		}

		
	}
}
