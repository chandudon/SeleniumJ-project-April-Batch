package extentreporters;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Extent1 
{

	public static void main(String args[]) throws IOException
	{
		ExtentHtmlReporter reporter;
		reporter=new ExtentHtmlReporter("C:\\Users\\chand\\Desktop\\extent reports\\report.html");
		ExtentReports reports=new ExtentReports();
		reports.attachReporter(reporter);
		
		ExtentTest test=reports.createTest("the test1");
		test.log(Status.INFO, "this is a new status in the roporter");
		test.pass("test is passed",MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\chand\\Desktop\\pictures\\m6.jpg").build());
		reports.flush();
	}
}
