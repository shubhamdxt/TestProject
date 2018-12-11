package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;

public class DashboardPage extends BaseClass{
	
	@FindBy(xpath="//a[text()='Home']")
	WebElement homeLink;  @FindBy(xpath="//a[text()='Men']") WebElement menLink;
	
	@FindBy(xpath="//a[text()='Women']")
	WebElement womenLink; @FindBy(xpath="//a[text()='Beauty']") WebElement beautyLink;
	
	@FindBy(xpath="//a[text()='Electronics']")
	WebElement electronicsLink; @FindBy(xpath="//a[text()='Sports']") WebElement SportsLink;
	
	@FindBy(xpath="//a[text()='Books']")
	WebElement BooksLink; @FindBy(xpath="//a[text()='Coupon']") WebElement CouponLink;
	
	@FindBy(xpath="//input[@name='q']")
	WebElement searchBox; @FindBy(xpath="//input[@value='Submit']") WebElement searchButton;
	
	public DashboardPage()   {
		PageFactory.initElements(driver, this);
	}

	
	public MenPage clickonMenLink() {
		
		menLink.click();
		
		return new MenPage();
	}
}
