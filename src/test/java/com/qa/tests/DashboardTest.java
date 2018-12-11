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

	@Test
	public void verifyMenLink() {
		dashboardPage.clickonMenLink();
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
