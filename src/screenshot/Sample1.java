package screenshot;

import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Sample1 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
	
		System.setProperty("webdriver.chrome.driver",
				"D:\\softwares\\selenium and chrome driver\\chrome driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		File file1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File obj=new File("C:\\Users\\chand\\Desktop\\selenium screenshots\\facebook.png");
		FileHandler.copy(file1,obj);
		
		
//		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		
//		File dest=new File("C:\\Users\\chand\\Desktop\\selenium screenshots\\facebook.png");
//		
//		FileHandler.copy(source, dest);
		
	}
}
