package com.qa.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
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
		 Thread.sleep(2000);
		dashboardPage.clickonMenLink();
		 Thread.sleep(2000);
	}
	
	/*@Test(priority=3)
	public void verifyProductSize() throws InterruptedException {
//		 homePage.clickforLogin();
//		  dashboardPage= loginPage.login(prop.getProperty("emailId"), prop.getProperty("password"));
		 
		dashboardPage.clickonMenLink();
		dashboardPage.productSize();
		
		
	}
	
	@Test(priority=4)
	public void verifyCheckboxSize() throws InterruptedException {
//		 homePage.clickforLogin();
//		  dashboardPage= loginPage.login(prop.getProperty("emailId"), prop.getProperty("password"));
//		 
		dashboardPage.clickonMenLink();
		Thread.sleep(2000);
		dashboardPage.checkboxBrand();
		Thread.sleep(2000);
	
		
		
	}
	@Test(priority=5)
	public void verifyFootwearLink() throws InterruptedException {
	//	 homePage.clickforLogin();
	//	  dashboardPage= loginPage.login(prop.getProperty("emailId"), prop.getProperty("password"));
	 System.out.println("ver footwer");
		dashboardPage.clickonMenLink();
		Thread.sleep(2000);
		 System.out.println("ver footwer1");
		
		dashboardPage.footbearlink();
		Thread.sleep(2000);
		 System.out.println("ver footwer2");

		}
	
	@Test(priority=6)
	public void verifySportShoeslink() throws InterruptedException {
		dashboardPage.clickonMenLink();
		Thread.sleep(2000);
		
		
		dashboardPage.footbearlink();
		Thread.sleep(2000);
		dashboardPage.sportshoeslink();
		Thread.sleep(2000);
	
	}
	
	
	@Test(priority=7)
	public void verifyCasulShoeslink() throws InterruptedException {
		dashboardPage.clickonMenLink();
		Thread.sleep(2000);
		
		
		dashboardPage.footbearlink();
		Thread.sleep(2000);
		dashboardPage.sportshoeslink();
		Thread.sleep(2000);
		dashboardPage.casualshoeslink();
		Thread.sleep(2000);
	
	}*/

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
}
