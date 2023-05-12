package com.ActiTime.GenericLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Filelibrary {
	
	
	/**
	 * this is a generic method which is used to read the data from property file.
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String readDataFromPropertyFile(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./testdata/commondata.property");
		Properties p = new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;	
	}
	
	
	/**
	 * this is a generic library class which contains all the generic method.
	 * @param sheetname
	 * @param r
	 * @param c
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String readDataFromExcel(String sheetname, int r, int c) throws EncryptedDocumentException, IOException {
		FileInputStream fis1 = new FileInputStream("./testdata/Testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis1);
		String data = wb.getSheet(sheetname).getRow(r).getCell(c).getStringCellValue();
		return data;
	}
}

