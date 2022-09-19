package listeners_demo;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners_demo.Sample2.class)
public class Sample1 
{
	@Test(enabled = false)
	public void testMethod()
	{
		System.out.println("this is the test ");
		Assert.fail();
	}
}
