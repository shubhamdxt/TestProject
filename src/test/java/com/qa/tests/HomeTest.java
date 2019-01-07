package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class HomeTest extends BaseClass{
	
	HomePage homePage;
	LoginPage loginPage;
	
	public HomeTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		
		homePage=new HomePage();
		loginPage=new LoginPage();
		
		}
	
	@Test(priority=1)
	public void homePageTitleTest() {
		
		String title=homePage.validateHomePageTitle();
		System.out.println("This is my home page title:"+title);
	
        }
	
	@Test(priority=2)
	public void utailerLogoTest() {
	    boolean flag=homePage.validUtailerImag();
	  
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void verifyLoginLink() throws InterruptedException {
		Thread.sleep(4000);
		loginPage=homePage.clickforLogin();
		Thread.sleep(4000);
	System.out.println("ananda sir birthday");
	System.out.println("ananda sir birthday");
	}
	
	
@AfterMethod
public void tearDown() {
	driver.quit();
}
}
