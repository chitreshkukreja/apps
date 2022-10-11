package com.self.exp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) {
		Properties p = new Properties();
		try {
			FileInputStream fis = new FileInputStream("abc.properties");
			p.load(fis);
			System.out.println(p);
			String s = p.getProperty("venki");
			System.out.println(s);
			System.out.println(p.getProperty("ravi"));
			p.setProperty("nag", "bhai");
			Enumeration e = p.propertyNames();
			while (e.hasMoreElements()) {
				System.out.println(e.nextElement());
			}
			FileOutputStream fos = new FileOutputStream("abc.properties");
			p.store(fos, "updated by ashok for scjp demo class");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
