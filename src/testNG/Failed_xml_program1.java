package testNG;


import org.testng.Reporter;
import org.testng.annotations.Test;

public class Failed_xml_program1 
{
	@Test
	public void test1()
	{
		
		Reporter.log("test1 is passed",true);
	}
	
	@Test
	public void test2()
	{
		Reporter.log("test2 is passed",true);
	}
	
	@Test
	public void test3()
	{
		//Assert.fail();
		Reporter.log("test3 is passed",true);
	}
	
	@Test
	public void test4()
	{
		Reporter.log("test4 is passed",true);
	}
	
	@Test
	public void test5()
	{
		Reporter.log("test5 is passed",true);
	}
	
	
}
