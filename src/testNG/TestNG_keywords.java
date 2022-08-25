package testNG;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_keywords 
{

	@Test(priority=1)
	public void method1()
	{
		Reporter.log("running a test", true);
	}
	@Test
	public void method2()
	{
		Reporter.log("running a test", true);
	}
	@Test(priority=5,invocationCount=4)
	public void method3()
	{
		Reporter.log("do it again", true);
	}
	@Test
	public void method4()
	{
		Reporter.log("running a test", true);
	}
	@Test
	public void method5()
	{
		Reporter.log("running a test", true);
	}
}
