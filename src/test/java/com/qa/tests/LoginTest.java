package com.qa.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.DashboardPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class LoginTest extends BaseClass{
	HomePage homePage;
	LoginPage loginPage;
	DashboardPage dashboardPage;
	
	
	public LoginTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage=new LoginPage();
		dashboardPage=new DashboardPage();
	}
	
	@Test(priority=1)
	public void loginTest() {
		
		
		/*homePage.clickforLogin();
		homePage=loginPage.login(prop.getProperty("emailId"), prop.getProperty("password"));*/
		
	
		
	}
}
