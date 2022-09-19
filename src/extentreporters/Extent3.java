package extentreporters;

import java.io.IOException;

import org.testng.ITestListener;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Extent3 implements ITestListener
{

	public static void main(String[] args) throws IOException 
	{
	
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("C:\\Users\\chand\\eclipse-workspace\\SeleniumJ\\extentReporter\\chand.html");
		
		ExtentReports reports=new ExtentReports();
		
		reports.attachReporter(reporter);
		
		ExtentTest test =reports.createTest("test 1");
		
		
		test.pass("passed or failed",MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\chand\\Desktop\\pictures\\m6.jpg").build());
		
		reports.flush();
		
	}
}
