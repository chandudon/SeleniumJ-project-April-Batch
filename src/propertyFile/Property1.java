package propertyFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Property1 
{

	public static void main(String args[]) throws IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\chand\\eclipse-workspace\\SeleniumJ\\PropertyFile\\chandrakant.properties");
		Properties property=new Properties();
		property.load(file);
		String Myname = property.getProperty("name");
		System.out.println(Myname);
	}
}
