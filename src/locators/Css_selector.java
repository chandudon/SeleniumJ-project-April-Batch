package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_selector {

	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver",
				"");
		WebDriver driver=new ChromeDriver();
		driver.get("");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.cssSelector(""));
		/*css selector syntaxes 
		 * for id - tagname#id
		 * for classname - tagname.classname
		 * for namr or any attribute - tagname[name='attribute value']
		 * or -- tagname[attribute name='attribute value']
		 * match with prefix - tagname[attribute^='prefix of attribute value']
		 * match with suffix - tagname[attribute$='suffix of attribute']
		 * match with substring - tagname[attribute*='attribute value']
		 * 
		 */
		
		
	}
}
