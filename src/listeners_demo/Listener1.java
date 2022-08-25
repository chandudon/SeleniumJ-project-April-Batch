package listeners_demo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener1 implements ITestListener
{
	@Override
	public void onStart(ITestContext context) 
	{
		System.out.println("at the starting of test"+context.getName());
		
	}
	
	@Override
	public void onTestStart(ITestResult result) 
	{
		System.out.println("at  starting of test case"+result.getName());
	}
	
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("on test success");
	}
	
	
	@Override
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("when test is skipped");
	}
	
	@Override
	public void onTestFailure(ITestResult result) 
	{
		System.out.println("when test is failed");
	}
	
	@Override
	public void onFinish(ITestContext context) 
	{
		System.out.println("when test is finished");
	}
	
}
