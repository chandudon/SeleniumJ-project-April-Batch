package testNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Hard_asserts 
{
	@Test
	public void test1()
	{
		String str="chand";
		String str1="chandu";
		//Assert.assertEquals(str, str1);
		//Reporter.log("the test is passed", true);
		
		Assert.assertNotEquals(str1, str, "they are  equal");
		Reporter.log("the test is passed", true);
		
		//Assert.assertTrue(false,"the result is true");
		
		//Assert.assertFalse(true,"the result is true ");
		
		//Assert.assertNull(null,"result is not matched");
		
		Assert.assertNotNull(str);
		Reporter.log("the test is passed",true);
		
		//Assert.fail("the test is failed");
		
		
		
		
	}
}
