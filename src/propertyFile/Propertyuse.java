package propertyFile;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Propertyuse 
{
	public void property() throws IOException
	{

	Properties pro=new Properties();
	FileInputStream file=new FileInputStream("C:\\Users\\chand\\eclipse-workspace\\SeleniumJ\\PropertyFile\\property.properties");
	pro.load(file);
	String str = pro.getProperty("name");
	
	System.out.println(str+"\n"+pro.getProperty("url"));
	}
	
	
	
	public static void main(String args[]) throws IOException
	{
		Propertyuse use=new Propertyuse();
		use.property();
	}
}
