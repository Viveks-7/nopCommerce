package com.nop.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class utility 
{
	static String value;
	
	public static String readconfig(String key) throws IOException
	{
		Properties cnf = new Properties();
		FileInputStream readcnf = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\Nop_Project\\config.properties");
		cnf.load(readcnf);
		value = cnf.getProperty(key);
		return value;
		
	}

}
