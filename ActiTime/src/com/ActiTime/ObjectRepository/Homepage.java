package com.ActiTime.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage 
{
	//declaration
	@FindBy(xpath = "//div[.='Tasks']")
	private WebElement task;
	
	@FindBy(xpath = "//div[.='Reports']")
	private WebElement report;
	
	@FindBy(xpath = "//div[.='Users']")
	private WebElement users;
	
	@FindBy(id = "logoutLink")
	private WebElement logout;
	
	//initialisation
	public Homepage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getTask() {
		return task;
	}
	
	
	//utilisation
	public WebElement getReport() {
		return report;
	}

	public WebElement getUsers() {
		return users;
	}

	public WebElement getLogout() {
		return logout;
	}
	
	
	
	
}
