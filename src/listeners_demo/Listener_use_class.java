package listeners_demo;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners_demo.Listener1.class)
public class Listener_use_class 
{

	@Test
	public void test11()
	{
		System.out.println();
	}
}
