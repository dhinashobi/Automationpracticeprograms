package com.Practice.Selenium.Demo.Site;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ToolsQAXL {
	
	/*
	 * public static void datadrivetest() throws IOException {
	 * 
	 * File file = new
	 * File("C:\\\\Users\\\\dgubend\\\\Desktop\\\\Dhina\\\\Selenium Project\\\\TestDataFB.xlsx"
	 * ); FileInputStream fis = new FileInputStream(file); XSSFWorkbook xwb = new
	 * XSSFWorkbook(fis); XSSFsheet sheet1 = xwb.getSheetAt(0);
	 * 
	 * 
	 * 
	 * 
	 * 
	 * }
	 */
	
	

	public static void main(String[] args) throws InterruptedException {
	

		MouseActions.browserLaunch("http://executeautomation.com/demosite/index.html");
		MouseActions.NormalActions();
	}

}
