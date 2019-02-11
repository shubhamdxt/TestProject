package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;
import com.qa.base.KeyWords;
import com.sun.org.apache.xpath.internal.compiler.Keywords;


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

	public boolean validUtailerImag()
	{
		return KeyWords.display(utailerLogo);
	}

	public LoginPage clickforLogin() throws InterruptedException {

		KeyWords.Click(homePageLoginlink);
		//homePageLoginlink.click();
		return new LoginPage();
	}
}
