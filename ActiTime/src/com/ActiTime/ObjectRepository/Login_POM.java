package com.ActiTime.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_POM 
{
	//declaration
	@FindBy(id="username")
	private WebElement untbx;
	
	@FindBy(name = "pwd")
	private WebElement pstbx;
	
	@FindBy(xpath = "//div[.='Login ']")
	private WebElement lgbtn;
	
	
	//initialisation
	public Login_POM(WebDriver driver) 
	{
	PageFactory.initElements(driver, this);
	}

	
	//utilisation
	public WebElement getUntbx() {
		return untbx;
	}


	public WebElement getPstbx() {
		return pstbx;
	}


	public WebElement getLgbtn() {
		return lgbtn;
	}

	
	
	
}
