package testNG;


import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions1 
{
	@Test
	public void chandrakant()
	{
		String exp = "chand";	
		String act = "chand";
		boolean chandra=false;
		if(exp==act)
		{
			chandra=true;
		}
		
		SoftAssert Assert=new SoftAssert();
		
		//1.assert equals -->both true -> pass ,,,assert fail 
    Assert.assertEquals(act, exp,"assertions is failed");	
	Assert.assertNotEquals(act, exp);
	Assert.assertNull(null,"vishal shete");	
	Assert.assertNotNull(exp );
	//Assert.fail();
	Assert.assertTrue(false,"chandrfakant shinde");
	Assert.assertFalse(chandra);
	System.out.println("chandrakant j shinde");
	Assert.assertAll();
		
	}
	@Test(invocationCount = 8)
	public void vishal()
	{
		System.out.println("vishal");
		Assert.fail();
	}
	
}
