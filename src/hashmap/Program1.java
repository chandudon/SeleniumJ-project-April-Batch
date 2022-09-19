package hashmap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Program1 
{

	public static void main(String[] args)
	{
		
		HashMap<String, String> map=new HashMap<String,String>();
		
		map.put("chandrakant001", "Rahul@123");
		map.put("vishal", "vishal123");
		map.put("snehal", "snehal1996");
		
		boolean result1 = map.containsKey("chandrakant001");
		System.out.println(result1);
		
		boolean result2 = map.containsValue("Rahul@123");
		System.out.println(result2);
		
		boolean key1 = map.containsKey("vishal");
		System.out.println(key1);
		
		//get methods will takes input as key and gives output as value for this particular key
		String get1 = map.get("vishal");
		System.out.println(get1);
		
		
		Set<Entry<String, String>> set = map.entrySet();
		
		for(Entry<String, String> loop:set)
		{
			System.out.println(loop);
		}
	}
}
