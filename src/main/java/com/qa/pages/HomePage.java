package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;


public class HomePage extends BaseClass{
	
	@FindBy(xpath="//span[text()='Login']")
	WebElement homePageLoginlink;
	
	@FindBy(xpath="//a[@class='logo']")
	WebElement utailerLogo;
	
	

	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateHomePageTitle(){
		return driver.getTitle();
	}
	
	public boolean validUtailerImag() {
        
		return utailerLogo.isDisplayed();
	}
	
	public LoginPage clickforLogin() throws InterruptedException {
		Thread.sleep(3000);
		homePageLoginlink.click();
		Thread.sleep(3000);
		return new LoginPage();
}

}
