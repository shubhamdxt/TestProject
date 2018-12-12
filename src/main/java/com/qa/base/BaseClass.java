package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.util.TestUtil;



public class BaseClass {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public BaseClass() {
		try {
		
			prop=new Properties();
		
			FileInputStream fileInputStream=new FileInputStream("C:\\Users\\akansha\\git\\TestProject\\src\\main\\java\\com\\qa\\config\\config.properties");
		     prop.load(fileInputStream);
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void initialization() {
		String browserName=prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\akansha\\git\\TestProject\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		    driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
			
			driver.get(prop.getProperty("url"));
			
		}
	}

}
