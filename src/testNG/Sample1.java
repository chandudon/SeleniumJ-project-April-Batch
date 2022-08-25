package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample1 
{
	@BeforeClass
	public void browseropen()
	{
		Reporter.log("repeted test cases", true);
	}
	@BeforeMethod
	public void login()
	{
		Reporter.log("login successful", true);
	}
	
	@Test
	public void m1()
	{
		Reporter.log("first test case", true);
		
	}
	@Test
	public void m2()
	{
		Reporter.log("test2 is running", true);
	}
	
	@AfterMethod
	public void logout()
	{
		Reporter.log("logout", true);
	}
	
	@AfterClass
	public void close()
	{
		Reporter.log("closed program", true);
	}
	
}
