package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_by_contains 
{

	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", 
				"D:\\softwares\\selenium and chrome driver\\chrome driver\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26ext_vrnc%3Dhi%26tag%3Dgooginhydr1-21%26ref%3Dnav_signin%26adgrpid%3D58972567855%26hvpone%3D%26hvptwo%3D%26hvadid%3D294134771458%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D17514184237589870726%26hvqmt%3Db%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9300351%26hvtargid%3Dkwd-513872812020%26hydadcr%3D5839_1914860%26gclid%3DCjwKCAjw46CVBhB1EiwAgy6M4h48QtkWpBYWhF-DzUOuWidXCTrK3Lf2JV6ddD26VU1p3ior2ch9vxoCEQ4QAvD_BwE&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//syntax for locator xpath
		driver.findElement(By.xpath("//input[contains(@id,\"ap_email\")]")).sendKeys("chandrakantshinde261@gmail.com");
		WebElement un = driver.findElement(By.xpath("//a[contains(text(),\"Privacy Notice\")]"));
		un.click();
		
		
	}
}
