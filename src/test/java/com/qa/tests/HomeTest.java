package com.qa.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class HomeTest extends BaseClass
{
	HomePage homePage;
	LoginPage loginPage;

	public HomeTest()
	{
		super();
	}

	@BeforeTest
	public void setUp()
	{
		initialization();
		homePage=new HomePage();
		loginPage=new LoginPage();
	}

	@Test(priority=1)
	public void homePageTitleTest() 
	{
		String title=homePage.validateHomePageTitle();
		System.out.println("This is my home page title:"+title);
		System.out.println("shubham");
	}

	@Test(priority=2)
	public void utailerLogoTest()
	{
		boolean flag=homePage.validUtailerImag();
		AssertJUnit.assertTrue(flag);
	}

	@Test(priority=3)
	public void verifyLoginLink() throws InterruptedException 
	{
		loginPage=homePage.clickforLogin();
		Thread.sleep(4000);
	}

	@AfterMethod
	public void tearDown()
	{
		
		driver.quit();
	}
}
