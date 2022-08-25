package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_asserts 
{
	@Test
	public void test()
	{
		String str="chandu";
		String str1="chandu";
		SoftAssert soft=new SoftAssert();
		soft.assertNotEquals(str, str1,"assert not equal failed");
		Reporter.log("using soft asserts",true);
		
		soft.assertEquals(str, str1,"assert equal failed");
		soft.assertTrue(false,"assert true failed");
		soft.assertAll();
		
	}
}
