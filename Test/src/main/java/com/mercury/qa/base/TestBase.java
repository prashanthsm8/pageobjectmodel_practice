package com.mercury.qa.base;

import java.io.FileInputStream;
import java.util.Properties;

import javax.sql.rowset.WebRowSet;

import org.openqa.selenium.WebDriver;

public class TestBase {

	static WebDriver driver;
	static Properties prop;
	
	
	public TestBase() {
		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("/Test/src/main/java/com/mercury/qa/config/genral.properties");
			prop.load(ip);
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	public static void initialization() {
		
		String browsername = prop.getProperty("prop");
		
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "/Test/drivers/chromedriver.exe");
		}
	}

	
}
