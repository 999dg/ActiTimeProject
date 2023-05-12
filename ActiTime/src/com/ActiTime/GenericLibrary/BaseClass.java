package com.ActiTime.GenericLibrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.ActiTime.ObjectRepository.Homepage;
import com.ActiTime.ObjectRepository.Login_POM;

public class BaseClass 
{	
	public static WebDriver driver;
	Filelibrary fl = new Filelibrary();
	@BeforeSuite
	public void databaseconnection() {
		Reporter.log("database connected",true);
	}
	
	@BeforeClass
	public void launchBrowser() throws IOException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String url = fl.readDataFromPropertyFile("url");
		driver.get(url);
		Reporter.log("Browser launched",true);
	}
	
	@BeforeMethod
	public void login() throws IOException {
		Login_POM lp = new Login_POM(driver);
		String un = fl.readDataFromPropertyFile("username");
		String ps = fl.readDataFromPropertyFile("password");
		lp.getUntbx().sendKeys(un);
		lp.getPstbx().sendKeys(ps);
		lp.getLgbtn().click();
		Reporter.log("Login Successfully",true);
	}
	
	@AfterMethod
	public void logout() {
		Homepage hp = new Homepage(driver);
		hp.getLogout().click();
		Reporter.log("Logout Successfully",true);
	}
	
	@AfterClass
	public void closebrowser() {
		driver.close();
		Reporter.log("browser closed successfully",true);
	}
	
	@AfterSuite
	public void databasedisconnection() {
		Reporter.log("Database disconnected",true);
	}
}
