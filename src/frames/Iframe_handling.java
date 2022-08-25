package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_handling 
{
	//iframe handled 
	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver",
				"D:\\softwares\\selenium and chrome driver\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		Thread.sleep(3000);
		
		WebElement iframe_variable = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(iframe_variable);
		Thread.sleep(2000);
		
		WebElement button = driver.findElement(By.xpath("//button[@type='button']"));
		button.click();
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[@id='tryhome']")).click();
	}
}
