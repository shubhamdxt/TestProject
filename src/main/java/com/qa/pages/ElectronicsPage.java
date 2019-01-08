package com.qa.pages;

import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;

public class ElectronicsPage extends BaseClass {
	public ElectronicsPage()   {
		PageFactory.initElements(driver, this);
	}
	
	public String ElectronicsPageTitle() {
		return driver.getTitle();
	}	
	
	
}
