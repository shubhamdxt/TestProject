package com.qa.base;

import org.openqa.selenium.WebElement;

public class KeyWords extends BaseClass{

	public static void Click(WebElement element)
	{
		element.click();
	}

	public static void SendData(WebElement element, String data)
	{
		element.sendKeys(data);
	}
	public static boolean display(WebElement element)
	{
		boolean displayed = element.isDisplayed();
		return displayed;
	}

}
