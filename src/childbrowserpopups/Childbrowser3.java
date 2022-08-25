package childbrowserpopups;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childbrowser3 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\chand\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		 
		//clicking on new window 
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		Thread.sleep(2000);
		
		
		Set<String> webids = driver.getWindowHandles();
		ArrayList<String> ar=new ArrayList<String>(webids);
		
		String homepageid = ar.get(0);
		String newwindowid = ar.get(1);
		
		Iterator<String> itr = ar.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		driver.switchTo().window(newwindowid);
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		//clicking on training option
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		Thread.sleep(2000);
		
		driver.switchTo().window(homepageid);
		
		//clicking on new tab
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		Thread.sleep(2000);
		
		driver.switchTo().window(newwindowid);
		
	}
}
