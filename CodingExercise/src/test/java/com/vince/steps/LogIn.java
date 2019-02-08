package com.vince.steps;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeSuite;

import org.testng.annotations.Test;

import com.vince.common.Base;
import com.vince.pages.loginPage;


public class LogIn extends Base{
	
	

	@BeforeSuite	
	public void open() {
		openBrowser();
	}
	
	
	@Test(priority=0)
	public void selectlogin() {
		loginPage li =new loginPage(driver);
		
		li.menu().click();
		li.login().click();
		}
	
	
	@Test(priority=1)
	public void login() {
		loginPage li =new loginPage(driver);
		li.useraname().sendKeys("John Doe");
		li.password().sendKeys("ThisIsNotAPassword");
		li.button().click();
		
	}
	@Test(priority=2)
	public void makeappointment() {
		loginPage li =new loginPage(driver);
		Select ap = new Select (li.facility());
		ap.selectByVisibleText("Hongkong CURA Healthcare Center");
		
		WebElement health = li.healthcare();
		health.click();
		
		WebElement dat = li.date();
		dat.sendKeys("02072019");
		
		li.comment().sendKeys("This is Vincent Gomes, see you soon");
		
		li.book().click();
		
	
		String actual=driver.getTitle();
		System.out.println(actual);
		Assert.assertEquals(actual, "CURA Healthcare Service");
		
	}
	@AfterSuite
	public void signo() {
		loginPage li =new loginPage(driver);
		li.menul().click();
		li.logoff().click();
		
				
	}
		


}
