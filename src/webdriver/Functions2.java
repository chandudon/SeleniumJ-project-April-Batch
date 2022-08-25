package webdriver;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Functions2 
{

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", 
				"D:\\softwares\\selenium and chrome driver\\chrome driver\\chromedriver.exe");
		
		WebDriver chand=new ChromeDriver();
		
		//1.get method => it is used to pass url
			chand.get("https://www.facebook.com/");
				
		//2.set size=>used to change the size of the browser
			Dimension d=new Dimension(1000, 2000);
			chand.manage().window().setSize(d);
			
			
		//3.setposition method
			
			Point cha=new Point(-500,500);
			chand.manage().window().setPosition(cha);
			
			
		//4.
			
			
			
			
			
			
		
		
		
		
		
		
	}
	
	
}
