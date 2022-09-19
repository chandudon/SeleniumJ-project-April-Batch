package extentreporters;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Extent2 
{

	public static void main(String args[]) throws IOException
	
	{
		
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("C:\\Users\\chand\\Desktop\\extent reports\\report2.html");
		ExtentReports reports=new ExtentReports();
		reports.attachReporter(reporter);
		
		ExtentTest test=reports.createTest("demo test");
		test.log(Status.INFO,"the status is there and running" );
		test.pass("the test is passed",MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\chand\\Desktop\\pictures\\m6.jpg").build());
		reports.flush();
		
	}
}
