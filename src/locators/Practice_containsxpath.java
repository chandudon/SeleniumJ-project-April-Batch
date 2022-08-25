package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_containsxpath 
{

	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", 
				"D:\\softwares\\selenium and chrome driver\\chrome driver\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/b?node=15325111031&pf_rd_r=Z2VZN0QPM5KEMBN77BBR&pf_rd_p=72c7745e-881e-4e38-b0bc-5266782289f9&pd_rd_r=dc0e"
				+ "f120-dff5-4a24-8c5e-c1982d71e6df&pd_rd_w=HdZ0W&pd_rd_wg=BLOBy&ref_=pd_gw_unk");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@title,\"Women's Footwear\")]")).click();
		
		
		
		
	}
}
