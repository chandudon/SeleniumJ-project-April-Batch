package screenshot;

import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot2
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
	
		System.setProperty("webdriver.chrome.driver",
				"D:\\softwares\\selenium and chrome driver\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://signup.zerodha.com/");
		Thread.sleep(2000);
		String random = RandomString.make(3);
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File chand=new File("C:\\Users\\chand\\Desktop\\selenium screenshots\\"+random+".jpg");
		
		FileHandler.copy(source, chand);
		
		
		
	}
}
