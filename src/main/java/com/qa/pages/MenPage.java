package com.qa.pages;

import java.util.List;

import org.apache.poi.hssf.record.PageBreakRecord.Break;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;

public class MenPage extends BaseClass{
	
	@FindBy(xpath="(//input[@class='manufacturerproduct'])[1]") WebElement dellBrandCheckbox;
	
	@FindBy(xpath="(//input[@class='manufacturerproduct'])[2]") WebElement allenBrandCheckbox;
	@FindBy(xpath="(//input[@class='manufacturerproduct'])[3]") WebElement samsungBrandCheckbox;
	@FindBy(xpath="(//input[@class='manufacturerproduct'])[4]") WebElement fendiBrandCheckbox;
	@FindBy(xpath="(//input[@class='manufacturerproduct'])[5]") WebElement coachBrandCheckbox;
	@FindBy(xpath="(//input[@class='manufacturerproduct'])[6]") WebElement pradaBrandCheckbox;
	
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
	public void allfilterByBrand() throws InterruptedException {
		
		if(!dellBrandCheckbox.isSelected()) {
			dellBrandCheckbox.click();
			Thread.sleep(2000);
			
			List<WebElement> dellProductElmnt=driver.findElements(By.xpath("//div[@class='products']"));
			
			    System.out.println("this is size of dell  product:"+dellProductElmnt.size());
			    
			    if(dellBrandCheckbox.isSelected()) {
			    	
			    	Thread.sleep(2000);
				
					dellBrandCheckbox.click();
			    }
			    Thread.sleep(2000);
		}
		
		
		if(!allenBrandCheckbox.isSelected()) {
			allenBrandCheckbox.click();
			Thread.sleep(2000);
			
			List<WebElement> allenProductElmnt=driver.findElements(By.xpath("//div[@class='products']"));
			
			    System.out.println("this is size of allen  product:"+allenProductElmnt.size());
			    
			    if(allenBrandCheckbox.isSelected()) {
			    	
			    	Thread.sleep(2000);
				
			    	allenBrandCheckbox.click();
			    }
			    Thread.sleep(2000);
		}
		
		
		if(!samsungBrandCheckbox.isSelected()) {
			samsungBrandCheckbox.click();
			Thread.sleep(2000);
			
			List<WebElement> samsungProductElmnt=driver.findElements(By.xpath("//div[@class='products']"));
			
			    System.out.println("this is size of samsung  product:"+samsungProductElmnt.size());
			    
			    if(samsungBrandCheckbox.isSelected()) {
			    	
			    	Thread.sleep(2000);
				
			    	samsungBrandCheckbox.click();
			    }
			    Thread.sleep(2000);
		}
		
		
		if(!fendiBrandCheckbox.isSelected()) {
			fendiBrandCheckbox.click();
			Thread.sleep(2000);
			
			List<WebElement> fendiProductElmnt=driver.findElements(By.xpath("//div[@class='products']"));
			
			    System.out.println("this is size of fendi  product:"+fendiProductElmnt.size());
			    
			    if(fendiBrandCheckbox.isSelected()) {
			    	
			    	Thread.sleep(2000);
				
			    	fendiBrandCheckbox.click();
			    }
			    Thread.sleep(2000);
		}
		
		
		
		if(!coachBrandCheckbox.isSelected()) {
			coachBrandCheckbox.click();
			Thread.sleep(2000);
			
			List<WebElement> coachProductElmnt=driver.findElements(By.xpath("//div[@class='products']"));
			
			    System.out.println("this is size of coach  product:"+coachProductElmnt.size());
			    
			    if(coachBrandCheckbox.isSelected()) {
			    	
			    	Thread.sleep(2000);
				
			    	coachBrandCheckbox.click();
			    }
			    Thread.sleep(2000);
		}
		
		if(!pradaBrandCheckbox.isSelected()) {
			pradaBrandCheckbox.click();
			Thread.sleep(2000);
			
			List<WebElement> pradaProductElmnt=driver.findElements(By.xpath("//div[@class='products']"));
			
			    System.out.println("this is size of prada  product:"+pradaProductElmnt.size());
			    
			    if(pradaBrandCheckbox.isSelected()) {
			    	
			    	Thread.sleep(2000);
				
			    	pradaBrandCheckbox.click();
			    }
			    Thread.sleep(2000);
		}
		
		}
		
			
		
		
		
		
        
		
	}	
	/*List<WebElement> byBrand=driver.findElements(By.xpath("//input[@type='checkbox']"));
	
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
	}*/
	
	

	


