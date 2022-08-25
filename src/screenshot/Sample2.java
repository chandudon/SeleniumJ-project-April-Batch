package screenshot;

import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Sample2 
{

	public static void main(String[] args) throws InterruptedException, IOException
	{
	
		System.setProperty("webdriver.chrome.driver",
				"D:\\\\softwares\\\\selenium and chrome driver\\\\chrome driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("");
		Thread.sleep(5000);
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String var = RandomString.make(4);
		
		File dest=new File("C:\\Users\\chand\\Desktop\\selenium screenshots\\google_"+var+".jpg");
		
		FileHandler.copy(source, dest);
		
		
	}
}
