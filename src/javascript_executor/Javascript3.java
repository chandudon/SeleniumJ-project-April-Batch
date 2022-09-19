package javascript_executor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript3 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\chand\\\\eclipse-workspace\\\\Batch\\\\Browser\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	}
}
