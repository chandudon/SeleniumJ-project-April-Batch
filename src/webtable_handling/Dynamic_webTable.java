package webtable_handling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Dynamic_webTable 
{

	int i=0;
	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\chand\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/chand/Desktop/daily%20files%20sent%20by%20dishaa%20institute/automation%20class/selenium%20programs/html%20for%20selenium/tables.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	  int tablesize = driver.findElements(By.xpath("//table[@id='abc123']//tbody//tr")).size();
	  String chand="100";
	  
	  for(int i=1;i<=tablesize;i++)
	  
	  {
		  int columnsize=0;
		  if(i==1)
		  {
			 columnsize = driver.findElements(By.xpath("((//table[@id='abc123']//tbody//tr))["+i+"]//th")).size();
		  }
		  else
		  {
			  columnsize=driver.findElements(By.xpath("((//table[@id='abc123']//tbody//tr)["+i+"]//td)")).size();
		  }
		  
		  
		  for(int j=1;j<=columnsize;j++)
		  {
			  String text="";
			  if(i==1)
			  {
				  text = driver.findElement(By.xpath("((//table[@id='abc123']//tbody//tr)["+i+"]//th)["+j+"]")).getText();
		
			  }
			  else
			  {
				  text=driver.findElement(By.xpath("((//table[@id='abc123']//tbody//tr)["+i+"]//td)["+j+"]")).getText();
				  
			  }
			  if(chand.equals(text))
			  {
				  System.out.println(i+","+j);
			  }
			  
			  
		  }
		  System.out.println();
	  }
	}
	
}
