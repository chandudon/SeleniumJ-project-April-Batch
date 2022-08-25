package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class program1
{

	//Webdriver chand=new Chromedriver();
	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver",
				"D:\\softwares\\selenium and chrome driver\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("")).click();
		Thread.sleep(2000);
		
		WebElement element1 = driver.findElement(By.xpath(""));
		
		Select var1=new Select(element1);
		Thread.sleep(2000);
//		//select class methods 
//		
//		//1. select by index
//		var1.selectByIndex(0);
//		
//		//select by value
//		var1.selectByValue("");
//		
//		//select by visible test will take string 
//		var1.selectByVisibleText("");
//		
//		//deselect by index will deselect the index value
//		var1.deselectByIndex(0);
//		
//		//deselect by value
//		var1.deselectByValue("");
//		
//		//deselect by visible text
//		var1.deselectByVisibleText("");
//		
//		//deselect all
//		var1.deselectAll();
//		
//		//get options
//		var1.getOptions();
//		
//		//get all selected options
//		var1.getAllSelectedOptions();
//		
//		//get first selected options
//		var1.getFirstSelectedOption();
//		
//		
		
//		//webelement methoods
//		
//		element1.clear();
//		element1.click();
//		element1.getTagName();
//		element1.sendKeys("");
//		element1.isDisplayed();
//		element1.isEnabled();
//		element1.isSelected();
//		
		
//		//webdriver methods
//		driver.get("");
//		driver.close();
//		driver.getCurrentUrl();
//		driver.getCurrentUrl();
//		driver.quit();
//		driver.manage().window().maximize();
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().forward();
//		
//		Dimension d=new Dimension(500, 500);
//		driver.manage().window().setSize(d);
//		
//		Point p=new Point(500, -200);
//		driver.manage().window().getPosition();
//		
//		driver.navigate().to("");
//		
		
		
	}
}
