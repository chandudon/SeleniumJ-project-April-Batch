package findelementsuse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_elements2
{
	//getting texts of multiple web elements

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\chand\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/?hl=en");
		Thread.sleep(2000);
		
		List<WebElement> list1 = driver.findElements(By.xpath("//a"));
		int size = list1.size();
		System.out.println(size);
		
		for(WebElement weblist:list1)
		{
		
			String str = weblist.getText();
			System.out.println(str);
			
			Thread.sleep(1000);
		}
	}
}
