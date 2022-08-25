package childbrowserpopups;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childbrowser4 
{

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\chand\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("")).click();
		
		Set<String> webpage_id = driver.getWindowHandles();
		
		ArrayList<String> ar=new ArrayList<String>(webpage_id);
		System.out.println(ar.get(0));
		System.out.println(ar.get(1));
		
		driver.switchTo().window(ar.get(1));
		
		driver.findElement(By.xpath(""));
		
		
	}
}
