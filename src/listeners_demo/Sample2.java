package listeners_demo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Sample2 implements ITestListener
{

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("starting the execution");
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("the test is a success");
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("the test execution started");
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("the test is skipped");
	}
	
	
	
	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("the test is completed");
	}
	
	
	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("the is failed");
	}
	
	
	
	
}
