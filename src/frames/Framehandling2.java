package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framehandling2 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver",
				"D:\\softwares\\selenium and chrome driver\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		Thread.sleep(2000);
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		
		driver.switchTo().frame(iframe);
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		//driver.switchTo().parentFrame();
		
		driver.findElement(By.xpath("//a[@id='tryhome']")).click();
		
	}
}
