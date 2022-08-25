package listbox;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program2 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver",
				"D:\\softwares\\selenium and chrome driver\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		WebElement new_account = driver.findElement(By.xpath("//a[contains(@id,'u_0_')]"));
		new_account.click();
		Thread.sleep(2000);
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		
		Select obj=new Select(day);
		obj.selectByIndex(0);
		Thread.sleep(2000);
		obj.selectByValue("20");
		Thread.sleep(2000);
		obj.selectByVisibleText("16");
		
		
		
		
		List<WebElement> var = obj.getOptions();
		int size = var.size();
		System.out.println("tota size"+size);
		
		
		
		for(WebElement weblist:var)
		{
			String a = weblist.getText();
			System.out.println(a);	
		}
		
		
	}
}
