package com.mercury.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mercury.qa.base.TestBase;

import bsh.This;

public class LoginPage extends TestBase {
	
	@FindBy(xpath="//*[@name='txtUsername']")
	WebElement username;
	
	@FindBy(xpath="//*[@name='txtPassword']")
	WebElement password;
	
	@FindBy(xpath="//*[@name='Submit']")
	WebElement login;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getusername()
	{
		return username;
		
	}
	
	public WebElement getpassword()
	{
		return password;
		
	}
	
	public WebElement getlogin()
	{
		return login;
	}
	
	
	
	
	
	
	
	

}
