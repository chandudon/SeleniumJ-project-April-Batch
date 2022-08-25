package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup
{

	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver",
				"D:\\softwares\\selenium and chrome driver\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(3000);
		
		 WebElement button = driver.findElement(By.xpath("//button[@id='alertButton']"));
		button.click();
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);
		
		WebElement frames = driver.findElement(By.xpath("//span[contains(text(),'Browser Windows')]"));
		frames.click();
		
		System.out.println(frames.isEnabled());
		
		Thread.sleep(2000);
		driver.close();
		
	}
}
