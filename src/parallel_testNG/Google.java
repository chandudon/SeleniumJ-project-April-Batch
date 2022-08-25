package parallel_testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Google
{
	@Test
	public void openGoogle() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\chand\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		driver.close();
	}
}
