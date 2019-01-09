package com.qa.tests;

import org.testng.annotations.BeforeMethod;

import com.qa.base.BaseClass;
import com.qa.pages.DashboardPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.MenPage;

public class ElectronicsTest extends BaseClass {
	HomePage ElectronicsTest;
	LoginPage loginPage;
	DashboardPage dashboardPage;
	MenPage menPage;
	
	
	public ElectronicsTest()
	{
		super();
	}	
	
	@BeforeMethod
	public void setUp() {
		initialization();
		
		loginPage=new LoginPage();
		dashboardPage=new DashboardPage();
		menPage=new MenPage();
		System.out.println("my test");
	}
}
