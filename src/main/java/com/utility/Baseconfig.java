package com.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Baseconfig {
	public String getconfig(String value) throws Exception {
String filepath = "./Config.properties";

FileInputStream fis = new FileInputStream(filepath);

Properties pro = new Properties();
pro.load(fis);

 String eachvalue = pro.get(value).toString();
//System.out.println(eachvalue);
	return (String) eachvalue;
}
	public static void main(String[] args) throws Exception {
		Baseconfig obj = new Baseconfig();
		obj.getconfig("PASSWORD");
		
		
	}
}
