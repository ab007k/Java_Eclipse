package com.eBanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	//Create Obj for Properties Class
	Properties pro;
	
	//Create Constructor
	//Whenever as soon as i created object for this class,this const will be invoked.
	//and property file will be loaded
	//and once property file loaded then we can read each and every value by adding a method.
	//so after creation of const we need to add diff method for each and every var.
	//let me just add them.
	public ReadConfig()
	{
		//2{//2.1>Here i have just created one src file ref_var and refering the path
		//2.2>Now here src is referring the properties file and i'm openning the same file in Input Mode using FileInputStream
		//2.3>Then pro obj i'm initiating
		//2.4>Then load the file which is open in input mode using pro.load(fis) method, it take Open File as an args.
		//2.5>Suppose if File is not available in this specified loc, there is chance to get an exception,so that i'm putting these statement in try catch block. 
		//Here we get the file by using directory and store in src//
		//2.1
		File src = new File("./Configuration/config.properties");

		try {
			//we import file which is present in src//
			//When we use FileInputStream>If u want to read the data, we have to open the file in read mode in that case  we use it.//			
			//2.2
			FileInputStream fis = new FileInputStream(src);
			//2.3
			pro = new Properties();
			//2.4
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}
	//Now here i will create diff methods one by one to read each&every var with the value(Just like Page Obj Class)
	//pro is an object_ref of an Peoperties Class, using this we need to call method to load the complete file inside  the const and
	//also to load and to read the propertise file,we have to use Properties class object,because this object provide certain method 
	//by using those method,we have to capture var's and their values.
	//Note:pro is not refering the config.properties file(load)
	//src is a obj_ref_var is referring the config.properties file
	//Every method return value because this value again we need to use in BaseClass or in another class.
	public String getApplicationURL()
	{
		String url=pro.getProperty("baseURL");
		return url;
	}
	
	public String getUsername()
	{
	String username=pro.getProperty("username");
	return username;
	}
	
	public String getPassword()
	{
	String password=pro.getProperty("password");
	return password;
	}
	
	public String getChromePath()
	{
	String chromepath=pro.getProperty("chromepath");
	return chromepath;
	}
	
	public String getIEPath()
	{
	String iepath=pro.getProperty("iepath");
	return iepath;
	}
	
	public String getFirefoxPath()
	{
	String firefoxpath=pro.getProperty("firefoxpath");
	return firefoxpath;
	}
	
}
