package webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Functions_kajal 
{

	
	public static void main(String[] args) throws Throwable 
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\softwares\\selenium and chrome driver\\chrome driver\\chromedriver.exe");
		
	
 WebDriver driver=new ChromeDriver();
	 
	 driver.get("https://www.google.com/");
	 
	 
	//maximize ---> use to maximise the browser size
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		//Get title => use to get title of current web page
		
		String title= driver.getTitle();
		System.out.println(title);
		
		driver.get("https://www.facebook.com/login/");
		
		Thread.sleep(2000);
		
		// Navigate =  backword 3
		Thread.sleep(2000);
	 
		 driver.navigate().back();
		   
		  //CHANGE THE SIZE OF BROWSER
		 Thread.sleep(3000);
		 Dimension d=new Dimension(200,400);
			driver.manage().window().setSize(d);
		 
			//CHANGE THE Position OF BROWSER
			Thread.sleep(2000);
			Point p=new Point(100, 500);
			driver.manage().window().setPosition(p);
	
		 //maximize browser
			Thread.sleep(2000);
			driver.manage().window().maximize();
			
			// Navigate =  backword 3
			Thread.sleep(2000);
		 
			 driver.navigate().forward();
			 
			 
		// frefresh the webpage
			 Thread.sleep(2000);
			 driver.navigate().refresh();
			 
			 //Quite=>use to close the browser
						driver.quit();
	}
}
