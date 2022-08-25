package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parameterization1
{

	//parameterization advanced 
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		
		FileInputStream file=new FileInputStream("C:\\Users\\chand\\Desktop\\parameterization.xlsx\\");
		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
		String un = sheet.getRow(0).getCell(1).getStringCellValue();
		String password = sheet.getRow(1).getCell(1).getStringCellValue();
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\softwares\\selenium and chrome driver\\chrome driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("");
		Thread.sleep(2000);
		
		WebElement usr = driver.findElement(By.xpath(""));
		usr.sendKeys(un);
		Thread.sleep(2000);
		
		WebElement pass = driver.findElement(By.xpath(""));
		pass.sendKeys(password);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("")).click();
		
	}
}
