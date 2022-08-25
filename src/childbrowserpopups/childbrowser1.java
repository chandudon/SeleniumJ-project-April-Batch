package childbrowserpopups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childbrowser1 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\chand\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		Thread.sleep(4000);
		
		Set<String> webid = driver.getWindowHandles();
		ArrayList<String> ar=new ArrayList<String>(webid);
		
		String id1 = ar.get(0);
		String id2 = ar.get(1);
		System.out.println(id1);
		System.out.println(id2);
		
		
		WebDriver window2 = driver.switchTo().window(id2);
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		Thread.sleep(3000);
		
		driver.navigate().back();
		
	}
}
