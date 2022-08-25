package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshothandling 
{

	public static void main(String[] args) throws InterruptedException, IOException
	{
	
		System.setProperty("webdriver.chrome.driver",
				"D:\\\\softwares\\\\selenium and chrome driver\\\\chrome driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.zomato.com/");
		Thread.sleep(5000);
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String var = RandomString.make(2);
	File dest=new File("C:\\Users\\chand\\Desktop\\selenium screenshots\\"+var+".jpg");
	
	FileHandler.copy(source, dest);
	
	
	}
}
