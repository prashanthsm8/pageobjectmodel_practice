package com.mercury.qa.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mercury.qa.base.TestBase;
import com.mercury.qa.pages.LoginPage;

public class test extends TestBase {

	LoginPage lp;
	
	public test() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	public void method1()
	{
		initialization();
		
		lp = new LoginPage();
	}
	
	@Test
	public void test1()
	{
		lp.getusername().sendKeys(prop.getProperty("username"));
		lp.getpassword().sendKeys(prop.getProperty("password"));
		lp.getlogin().click();
	}

}
