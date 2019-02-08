package com.vince.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	 public static WebDriver driver;
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\WebDriver/chromedriver.exe");
		 driver=new ChromeDriver();
		driver.navigate().to("https://katalon-demo-cura.herokuapp.com/");
		}

	public  void closeBrowser() {
		driver.close();
	}
	}
	


