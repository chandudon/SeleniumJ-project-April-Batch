package findelementsuse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelements_method 
{
//multiple checkbox selection inside iframe 
	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\chand\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_checkbox");
		Thread.sleep(2000);
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@name='iframeResult']"));
		Thread.sleep(2000);
		WebDriver frame = driver.switchTo().frame(iframe);
		
		List<WebElement> list1 = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(WebElement weblist:list1)
		{
		
			weblist.click();
			Thread.sleep(1000);
		}
		
	}
}
