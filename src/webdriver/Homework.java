package webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework 
{

	public static void main(String[] args) throws Throwable 
	{
	
		System.setProperty("webdriver.chrome.driver", 
				"D:\\softwares\\selenium and chrome driver\\chrome driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		driver.get("https://www.youtube.com/");
		Thread.sleep(500);
		
		driver.navigate().back();
		Thread.sleep(500);
		
		driver.navigate().refresh();
		Thread.sleep(500);
		
		driver.navigate().forward();
		Thread.sleep(500);
		
		
		Dimension d=new Dimension(500,800);
		driver.manage().window().setSize(d);
		
		Point p=new Point(500,500);
		driver.manage().window().setPosition(p);
		Thread.sleep(500);
		
		driver.quit();
		
		
		
	}
}
