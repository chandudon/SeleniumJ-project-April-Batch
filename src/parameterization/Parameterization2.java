package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parameterization2 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\softwares\\selenium and chrome driver\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
	FileInputStream chand=new FileInputStream("C:\\Users\\chand\\Desktop\\parameterization.xlsx\\");
		Sheet file = WorkbookFactory.create(chand).getSheet("demo1");
		
		
		String var = file.getRow(6).getCell(1).getStringCellValue();
		String var2 = file.getRow(6).getCell(6).getStringCellValue();
		double var3 = file.getRow(8).getCell(1).getNumericCellValue();
		
		
		System.out.println(var);
		System.out.println(var2);
		System.out.println(var3);
		
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(var);
		
		driver.findElement(By.xpath("")).sendKeys(var2);
		
	}
}
