package com.qa.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.DashboardPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class DashboardTest extends BaseClass{
	HomePage homePage;
	LoginPage loginPage;
	DashboardPage dashboardPage;
	
	public DashboardTest()
	{
		super();
	}	
	
	@BeforeMethod
	public void setUp() {
		initialization();
		homePage=new HomePage();
		loginPage=new LoginPage();
		dashboardPage=new DashboardPage();
	}

	
	@Test(priority=1)
	public void verifyDasboardTitle() {
		dashboardPage.validateDashboardPageTitle();
	}
	@Test(priority=2)
	public void verifyMenLink() throws InterruptedException {
		  homePage.clickforLogin();
		  dashboardPage= loginPage.login(prop.getProperty("emailId"), prop.getProperty("password"));
		 
		dashboardPage.clickonMenLink();
		
	}
	
	@Test(priority=3)
	public void verifyProductSize() throws InterruptedException {
		 homePage.clickforLogin();
		  dashboardPage= loginPage.login(prop.getProperty("emailId"), prop.getProperty("password"));
		 
		dashboardPage.clickonMenLink();
		dashboardPage.productSize();
		
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
}
