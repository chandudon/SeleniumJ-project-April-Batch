package parallel_testNG;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CT2 
{

	@Parameters("BrowserName")
	@Test
	public void openChrome(String BrowserName)
	{
		WebDriver driver=null;
		if(BrowserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\chand\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
			driver=new ChromeDriver();
		}
		else if(BrowserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",
					"D:\\softwares\\firefox gecko driver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(BrowserName.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver",
					"D:\\softwares\\microsoft edge webdriver\\edgedriver_win64\\msedgedriver.exe");
			driver=new EdgeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		String actual=driver.findElement(By.xpath("//a[text()='Create New Account']")).getText();
		String expect="Create New Account";
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(actual, expect);
		driver.close();
		soft.assertAll();
		
	}
	
}
