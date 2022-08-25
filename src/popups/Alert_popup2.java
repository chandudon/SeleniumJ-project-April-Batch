package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup2 
{

	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver",
				"D:\\softwares\\selenium and chrome driver\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("")).click();
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		driver.findElement(By.xpath("")).click();
		Thread.sleep(2000);
		
		driver.close();
	}
}
