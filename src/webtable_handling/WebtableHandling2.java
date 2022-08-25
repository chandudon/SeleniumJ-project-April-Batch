package webtable_handling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableHandling2 
{

	public static void main(String[] args)
	{
	
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\chand\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/chand/Desktop/daily%20files%20sent%20by%20dishaa%20institute/automation%20class/selenium%20programs/html%20for%20selenium/tables.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		List<WebElement> table_data = driver.findElements(By.xpath("//html//tr"));
		
		for(WebElement op:table_data)
		{
			System.out.println(op.getText());
		}
	}
}
