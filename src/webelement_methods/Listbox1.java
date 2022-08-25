package webelement_methods;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox1
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", 
				"D:\\softwares\\selenium and chrome driver\\chrome driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(2000);
		
		WebElement option1 = driver.findElement(By.name("birthday_day"));
		
		Select chand=new Select(option1);
		
		//select by index method==select class
		chand.selectByIndex(10);
		// select by value , select by visible text, getoptions()
		List<WebElement> var1 = chand.getOptions();
		int h1 = var1.size();
		
		System.out.println("size of dates is :"+h1);
		
//		for(WebElement obj1:var1)
//	{	
//			System.out.println(obj1.getText());
//	
//	}
//	
//		System.out.println("*********************************************");
//		for(int i=0;i<=var1.size()-1;i++)
//		{
//			WebElement cha = var1.get(i);
//			System.out.println(cha.getText());
//		
//		}
		
		ArrayList ar=new ArrayList();
		TreeSet tr=new TreeSet();
		
		for(WebElement obj2:var1)
		{
			String text = obj2.getText();
			ar.add(text);
		}
		//obj2= path.....
		//1=obj2.getText();
		//ar.add("1");
		
		for(Object jaa:ar)
		{
			System.out.println(jaa);
			
		
		}
			
	}
}
