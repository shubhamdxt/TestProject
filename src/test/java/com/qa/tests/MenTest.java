package com.qa.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.DashboardPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.MenPage;

public class MenTest extends BaseClass{
	HomePage homePage;
	LoginPage loginPage;
	DashboardPage dashboardPage;
	MenPage menPage;
	
	
	public MenTest()
	{
		super();
	}	
	
	@BeforeMethod
	public void setUp() {
		initialization();
		homePage=new HomePage();
		loginPage=new LoginPage();
		dashboardPage=new DashboardPage();
		menPage=new MenPage();
	}
	
	@Test(priority=1)
	public void verifyMenTitle() {
		menPage.validateMenPageTitle();
	}
	
	@Test(priority=2)
	public void verifyProductSize() throws InterruptedException {
//		 homePage.clickforLogin();
//		  dashboardPage= loginPage.login(prop.getProperty("emailId"), prop.getProperty("password"));
		 
		dashboardPage.clickonMenLink();
		Thread.sleep(2000);
	    menPage.productSize();
	    Thread.sleep(2000);
		}
	
	@Test(priority=3)
	public void verifyfilterbybrand() throws InterruptedException {
		Thread.sleep(2000);
		dashboardPage.clickonMenLink();
		Thread.sleep(2000);
	    menPage.productSize();
	    Thread.sleep(2000);
	    menPage.allfilterByBrand();
	    Thread.sleep(2000);
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
