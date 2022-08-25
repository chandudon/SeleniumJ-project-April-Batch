package PageObjectModelPOM;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClassInstagram 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
	
		FileInputStream file=new FileInputStream("C:\\Users\\chand\\Desktop\\parameterization.xlsx\\");
		Sheet sheet = WorkbookFactory.create(file).getSheet("demo1");
		
		String Insta_user = sheet.getRow(0).getCell(0).getStringCellValue();
		String Insta_password = sheet.getRow(1).getCell(1).getStringCellValue();
		
		
	  double Insta_mobile = sheet.getRow(10).getCell(1).getNumericCellValue();
		//String Insta_mobile ="9658795682";
		String Insta_fullname = sheet.getRow(2).getCell(0).getStringCellValue();
		String Signup_password = sheet.getRow(7).getCell(1).getStringCellValue();
		
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\chand\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		InstagramSignIn obj1=new InstagramSignIn(driver);
		InstagramSignUp obj2=new InstagramSignUp(driver);
		
		obj1.getuser(Insta_user);
		obj1.getpassword(Insta_password);
		obj1.SignUppage();
		
		Thread.sleep(2000);
		
		obj2.getMobile(Insta_mobile);
		obj2.getFullName(Insta_fullname);
		obj2.getPassword(Signup_password);
		
	}
}
