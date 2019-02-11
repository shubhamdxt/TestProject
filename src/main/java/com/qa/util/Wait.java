package com.qa.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.BaseClass;

public class Wait extends BaseClass {
	WebDriverWait wait = new WebDriverWait(driver, 20);
	public void WaitForElementLocate(WebElement element1) {
		// TODO Auto-generated method stub
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated((By) element1));
	}
	public void WaitForvisibilityOfElementLocated(WebElement element1) {
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated((By)element1));
	}

	public void WaitForelementToBeClickable(WebElement element1) {
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable((By)element1));
	}

	public void WaitForframeToBeAvailableAndSwitchToIt(WebElement element1) {
		WebDriver dr = wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt((By)element1));
	}	
		
		public void WaitFortextToBePresent(WebElement element1, String text) {
		wait.until(ExpectedConditions.textToBePresentInElement((By)element1,text));
	}
}