package com.ActiTime.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage 
{
	//declaration
	@FindBy(xpath = "//div[.='Add New']")
	private WebElement addnew;
	
	@FindBy(xpath = "//div[@class='item createNewCustomer']")
	private WebElement cncustomer;
	
	@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement entercustname;
	
	@FindBy(xpath = "(//textarea[@class='textarea'])[9]")
	private WebElement entercustdesc;
	
	@FindBy(xpath = "//div[.='Create Customer']")
	private WebElement createcust;
	
	@FindBy(xpath = "//div[@class='greyButton cancelBtn']")
	private WebElement cancel;
	
	//initialisation
	
	public TaskPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//utilisation
	public WebElement getAddnew() {
		return addnew;
	}

	public WebElement getCncustomer() {
		return cncustomer;
	}

	public WebElement getEntercustname() {
		return entercustname;
	}

	public WebElement getEntercustdesc() {
		return entercustdesc;
	}

	public WebElement getCreatecust() {
		return createcust;
	}

	public WebElement getCancel() {
		return cancel;
	}
	
}
