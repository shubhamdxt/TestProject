package com.qa.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
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

	public LoginTest() 
	{
		super();
	}

	@BeforeTest
	public void setUp() {
		initialization();
		loginPage=new LoginPage();
		homePage=new HomePage();
		dashboardPage=new DashboardPage();
	}

	@Test(priority=1)
	public void verifyLoginPageTitle() {
		String titleOfLogin=loginPage.loginPageTitle();
		System.out.println("my test page: " + titleOfLogin);
	}

	@Test(priority=2)
	public void loginTest() throws InterruptedException {
		System.out.println("before login");
		/* WebElement myDynamicElement = (new WebDriverWait(driver, 10))
				  .until(ExpectedConditions.invisibilityOfElementLocated(loginPage.login(prop.getProperty("emailId"), prop.getProperty("password"))));*/
		homePage.clickforLogin();
		dashboardPage= loginPage.login(prop.getProperty("emailId"), prop.getProperty("password"));
		System.out.println("after login " +dashboardPage);
	}

	@AfterClass
	public void tearDown(){
		driver.quit();
	}
}
