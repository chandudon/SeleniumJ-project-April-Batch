package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample_class1 
{
	@Test(groups="login")
	public void test1()
	{
		Reporter.log("the login test", true);
	}
	@Test(groups="login")
	public void test2()
	{
		Reporter.log("the login test", true);
	}
	@Test(groups="homepage")
	public void test3()
	{
		Reporter.log("the homepage test", true);
	}
	@Test(groups="homepage")
	public void test4()
	{
		Reporter.log("the homepage test", true);
	}
	@Test(groups="logout")
	public void test5()
	{
		Reporter.log("the logout test", true);
	}
	
}
