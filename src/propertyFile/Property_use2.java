package propertyFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Property_use2 
{

	public static void main(String args[]) throws IOException
	{
		Properties pro=new Properties();
		FileInputStream file=new FileInputStream("C:\\Users\\chand\\eclipse-workspace\\SeleniumJ\\PropertyFile\\chandrakant.properties");
		pro.load(file);
		String address = pro.getProperty("address");
		System.out.println(address);
	}
}
