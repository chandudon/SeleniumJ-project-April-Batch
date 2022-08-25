package findelementsuse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select_elements1 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\chand\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/chand/Desktop/daily%20files%20sent%20by%20dishaa%20institute/automation%20class/selenium%20programs/html%20for%20selenium/checkbox.html");
		Thread.sleep(2000);
		
		List<WebElement> list1 = driver.findElements(By.xpath("//input[@type='checkbox']"));
		Thread.sleep(2000);
		
		for(WebElement var1:list1)
		{
			String webelement = var1.getText();
			System.out.println(webelement);
			var1.click();
			Thread.sleep(1000);
		}
		for(int i=list1.size()-1;i>=0;i--)
		{
			//System.out.println();
			WebElement web = list1.get(i);
			web.click();
			Thread.sleep(1000);
		}
		
	}
}
