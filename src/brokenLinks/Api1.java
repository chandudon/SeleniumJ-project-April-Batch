package brokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Api1 
{
	public static int notactive;
	public static void main(String [] args) throws MalformedURLException, IOException
	{
		System.setProperty("webdriver.chrome.driver",
"D:\\softwares\\selenium and chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		System.out.println("the size is "+links.size());
		
		ArrayList<WebElement> active_links=new ArrayList<WebElement>();
		for(int i=0;i<=links.size()-1;i++)
		{
			if(links.get(i).getAttribute("href")!=null && (links.get(i).getAttribute("href").contains("https")))
			{
				active_links.add(links.get(i));
			}
			else
			{
				System.out.println("null");
				notactive++;
			}
		}
		
		System.out.println(notactive);
		
//		for(int j=0;j<=active_links.size()-1;j++)
//		{
//			System.out.println(active_links.get(j).getAttribute("href"));
//		}
//		
		
		
		
		
		for(int j=0;j<=active_links.size()-1;j++)
		{
			
HttpURLConnection connection = (HttpURLConnection)new URL(active_links.get(j).getAttribute("href")).openConnection();
			connection.connect();
			
			int code = connection.getResponseCode();
			String msg = connection.getResponseMessage();
			connection.disconnect();
		if(code!=200)
		{
			System.out.println("the location is =="+j);
			System.out.println(active_links.get(j).getAttribute("href")+"=="+"response code is=="+code+"==response message is"+msg);
		}
		}
	}
}
