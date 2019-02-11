package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;
import com.qa.base.KeyWords;

public class LoginPage extends BaseClass{

	@FindBy(xpath="//input[@name='useremail']")
	WebElement emailId;

	@FindBy(xpath="//input[@name='userpassword']")
	WebElement password;

	@FindBy(xpath="//input[@value='Login']")
	WebElement loginBtn;

	@FindBy(xpath="//a[text()='Forgot Password?']")
	WebElement forgotPassLink;

	public LoginPage() 
	{
		PageFactory.initElements(driver, this);
	}

	public String loginPageTitle() 
	{
		return driver.getTitle();
	}

	public DashboardPage login(String emil,String pass) throws InterruptedException
	{
		KeyWords.SendData(emailId, emil);
		KeyWords.SendData(password, pass);
		KeyWords.Click(loginBtn);
		return new DashboardPage();

	}
}
