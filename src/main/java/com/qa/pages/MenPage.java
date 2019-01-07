package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;

public class MenPage extends BaseClass{
	
	
	public MenPage()   {
		PageFactory.initElements(driver, this);
	}
	
	public String validateMenPageTitle(){
		return driver.getTitle();
	}
	
	public void productSize() {
		 List<WebElement> product=driver.findElements(By.xpath("//div[@class='products']"));
	//	List<WebElement> rows=driver.findElements(By.name(name))
		    int count = product.size();
		    System.out.println("this is size of product:"+count);
//		    for (WebElement items : rows){
//		    System.out.println(items.getText());
//		    }
		    
		    
}
	public void filterByBrand() {
	List<WebElement> byBrand=driver.findElements(By.xpath("//input[@type='checkbox']"));
	
	for(int i=0;i<byBrand.size();i++) {
		System.out.println(byBrand.get(i).getText());
		
		byBrand.get(i).click();
		//byBrand.get(i).click();
		if(byBrand.equals("Dell")) {
			byBrand.get(i).click();	
		}else {
			System.out.println("fsfvs");
		}
	//	System.out.println(byBrand.get(i).click());
	}
	}

}
