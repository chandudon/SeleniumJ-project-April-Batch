package parallel_testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class CT 
{

	@Parameters("BrowserName")
	@Test
	public void test(String BrowserName)
	{
		WebDriver driver=null;
		if(BrowserName.equals("chrome")) 
		{
		
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\chand\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
			driver=new ChromeDriver();
			
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
		String expected="Create New Account";
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(actual, expected);
		driver.close();
		soft.assertAll();
		
		
	}
}
