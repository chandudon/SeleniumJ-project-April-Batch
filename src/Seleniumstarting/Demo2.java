package Seleniumstarting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo2
{

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.edge.driver",
				"D:\\softwares\\microsoft edge webdriver\\edgedriver_win64\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.close();
		
	}
	
}
