package autosuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggest2 
{

	public static void main(String[] args) throws InterruptedException 
	{
		String str="oppo a57";
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\chand\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[contains(@class,'gLFyf')]")).sendKeys("oppo");
		Thread.sleep(2000);
		
		List<WebElement> suggest_list = driver.findElements(By.xpath("//html//body//ul//li"));
		
		for(WebElement op:suggest_list)
		{
			if(str.equals(op.getText()))
			{
				System.out.println(op.getText());
				op.click();
				break;
			}
		}
		

	}
}
