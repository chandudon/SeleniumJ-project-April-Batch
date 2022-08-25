package autosuggestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggest3
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		String hp="hp laptop i5";
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\chand\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		
		
		//driver.findElement(By.xpath("")).sendKeys("");  for username
		//driver.findElement(By.xpath("")).sendKeys("");  for password field
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//button)[2]")).click();
		
		driver.findElement(By.xpath("//input[1]")).sendKeys("hp laptop");
		Thread.sleep(2000);
		
		List<WebElement> suggest_list = driver.findElements(By.xpath("//html//body//div//ul//li"));
		
		for(WebElement op:suggest_list)
		{
			
			if(hp.equals(op.getText()))
			{
				System.out.println(op.getText());
				op.click();
				break;
			}
		}
		driver.close();
		
	}
}
