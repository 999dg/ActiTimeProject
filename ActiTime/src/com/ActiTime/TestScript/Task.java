package com.ActiTime.TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.ActiTime.GenericLibrary.BaseClass;
import com.ActiTime.GenericLibrary.Filelibrary;
import com.ActiTime.ObjectRepository.Homepage;
import com.ActiTime.ObjectRepository.TaskPage;

public class Task extends BaseClass
{
	@Test
	public void createCustomer() throws EncryptedDocumentException, IOException, InterruptedException {
		Homepage hp = new Homepage(driver);
		hp.getTask().click();
		Thread.sleep(1000);
		TaskPage tp = new TaskPage(driver);
		tp.getAddnew().click();
		Thread.sleep(1000);
		tp.getCncustomer().click();
		Filelibrary fl = new Filelibrary();
		String name = fl.readDataFromExcel("Sheet1",0,1);
		tp.getEntercustname().sendKeys(name);
		String desc = fl.readDataFromExcel("Sheet1",2,2);
		tp.getEntercustdesc().sendKeys(desc);
		Thread.sleep(1000);
		tp.getCreatecust().click();
		
	}
	
	
}
