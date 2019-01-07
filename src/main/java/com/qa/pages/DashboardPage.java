package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.qa.base.BaseClass;

public class DashboardPage extends BaseClass{
	
	private static final long ExpectedConditions = 0;

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
	
	@FindBy(xpath="//div[@class='products']") WebElement productSize;
	
	@FindBy(xpath="//input[@class='manufacturerproduct']") WebElement checkboxBrand;
	
	@FindBy(xpath="//a[text()='Footwear']") WebElement footwearLink;
	
	@FindBy(xpath="//a[text()='Sports Shoes']") WebElement sportshoeslink;
	
	@FindBy(xpath="//a[text()='Sports Shoes']") WebElement casualshoesLink;
	

	public DashboardPage()   {
		PageFactory.initElements(driver, this);
	}
	
	public String validateDashboardPageTitle(){
		return driver.getTitle();
	}
	
	public MenPage clickonMenLink() {
		
		menLink.click();
		
		return new MenPage();
	}
	
	/*public void productSize() {
		 List<WebElement> product=driver.findElements(By.xpath("//div[@class='products']"));
	//	List<WebElement> rows=driver.findElements(By.name(name))
		    int count = product.size();
		    System.out.println("this is size of product:"+count);
//		    for (WebElement items : rows){
//		    System.out.println(items.getText());
//		    }
	}*/
	
	public void checkboxBrand() {
		List<WebElement> chechboxList=driver.findElements(By.xpath("//input[@class='manufacturerproduct']"));
		int itemList=chechboxList.size();
		System.out.println("Afetr one checkbox size of product is:"+itemList);
	}
	
	public void footbearlink() {
		Actions action=new Actions(driver);
	//	WebElement webElmnt=driver.findElement(By.xpath("//a[text()='Footwear']"));
		action.moveToElement(footwearLink).build().perform();
	
	
	}
	
	public void sportshoeslink() {
		Actions actionsport=new Actions(driver);
		
		//WebElement webElmnt=driver.findElement(By.xpath("//a[text()='Footwear']"));
		actionsport.moveToElement(sportshoeslink).build().perform();
	
	
	}
	public void casualshoeslink() {
		Actions actioncasulsport=new Actions(driver);
		
		//WebElement webElmnt=driver.findElement(By.xpath("//a[text()='Footwear']"));
		actioncasulsport.moveToElement(casualshoesLink).build().perform();
	
	
	}
}
