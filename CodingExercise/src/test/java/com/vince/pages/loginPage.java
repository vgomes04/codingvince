package com.vince.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.vince.common.Base;

public class loginPage {
	
	
public loginPage(WebDriver driver) {
	Base.driver=driver;
	PageFactory.initElements(driver, this);
	}

@FindBy(xpath ="//a[@id='menu-toggle']") WebElement menu;
public WebElement menu() {
	return menu;
}
@FindBy(linkText="Login") WebElement lo;
public WebElement login() {
	return lo;
}

@FindBy(name="username") WebElement uName;
public WebElement useraname() {
	return uName;
}
@FindBy(id="txt-password") WebElement pass;
public WebElement password() {
	return pass;
}
@FindBy(id="btn-login") WebElement but;
public WebElement button() {
	return but;
}
@FindBy(xpath= "//select[@name='facility']") WebElement cFac;
public WebElement facility() {
	return cFac;
	
}
@FindBy(id="radio_program_medicaid") WebElement hProg;
public WebElement healthcare() {
	return hProg;
}
@FindBy(name="visit_date") WebElement vDate;
public WebElement date() {
	return vDate;
}
@FindBy(id="txt_comment") WebElement tCom;
public WebElement comment() {
	return tCom;
}
@FindBy(id="btn-book-appointment") WebElement sub;
public WebElement book() {
	return sub;
}
@FindBy(xpath ="//a[@id='menu-toggle']") WebElement menul;
public WebElement menul() {
	return menul;
}
@FindBy(linkText="Logout") WebElement lOff;
public WebElement logoff() {
	return lOff;
}
}
