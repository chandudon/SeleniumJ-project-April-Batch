package testNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample_class2 
{

	@Test(groups="instagram",invocationCount=3)	
	public void testA()
	{
		Reporter.log("the instagram  test", true);
	}
	@Test(groups="instagram")
	public void testB()
	{
		Assert.fail();
		Reporter.log("the instagram test", true);
	}
	@Test(groups="status")
	public void testC()
	{
		Reporter.log("the status test", true);
	}
	@Test(groups="status")
	public void testD()
	{
		Reporter.log("the status test", true);
	}
	@Test(groups="status")
	public void testE()
	{
		Reporter.log("the status test", true);
	}
}
