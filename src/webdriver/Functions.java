package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Functions 
{

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", 
				"D:\\softwares\\selenium and chrome driver\\chrome driver\\chromedriver.exe");
		
		WebDriver chand=new ChromeDriver();
		
		
		//1.get method => it is used to pass url
		chand.get("https://www.facebook.com/");
		//2.close => used to close current tab of browser
		
		
		//2.get title => use to get title of perticular url 
		String title = chand.getTitle();
		System.out.println(title);
		
		//3.get current url => use to get current url of the page
		System.out.println(chand.getCurrentUrl());
		
		//4.Maximize => used to maximize the size of browser
		chand.manage().window().maximize();
		
		//5.navigate method=> 1.forward 2.backward 3.refresh 
		chand.navigate().refresh();
		chand.navigate().back();
		chand.navigate().forward();
		
		
		//url pass
		chand.navigate().to("https://www.youtube.com/");
		chand.navigate().back();
		
		
		//6.quite=> used to close the browser
		chand.quit();
		
		
		//7. close method 
		//used to close the current tab of the browser
		
		
		
		
		
		
		
		
	}
}
