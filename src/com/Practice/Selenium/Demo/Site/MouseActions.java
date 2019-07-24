 package com.Practice.Selenium.Demo.Site;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseActions {
	
	
	public static WebDriver driver;
	
	
	  public static void browserLaunch(String URL) {
	  
		
		  System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\dgubend\\\\Desktop\\\\Dhina\\\\Selenium Project\\\\chromedriver_win32\\\\chromedriver.exe");
		 
	  
		  
	  driver = new ChromeDriver();
	  
	  driver.get(URL);
	  
	  driver.manage().window().maximize();
	  
	  
	  }
	 

	  public static void dropdownvalues(WebElement title, String value) {
		  
		Select obj = new Select(title);
		  
		obj.selectByValue(value);
		/*
		 * obj.selectByVisibleText(text);
		 * obj.selectByIndex(index);
		 */
		  
	  }
	
	  public static void XLSheetWorkbook() throws FileNotFoundException, IOException {
		  
		  File file = new File("C:\\Users\\dgubend\\Desktop\\Dhina\\Selenium Project\\TestDataFB.xlsx");
		  FileInputStream fis = new FileInputStream(file);
		  XSSFWorkbook xwb = new XSSFWorkbook(fis);
		  XSSFSheet sheet1 = xwb.getSheetAt(0);	
		  XSSFRow row = null;
		  
		  row = sheet1.getRow(0);
		  	
		  int totalNoOfRows = sheet1.getLastRowNum();
		  int colCount = row.getLastCellNum();
		
		  System.out.println("Column Count :- " + colCount);
		  
		  int rowCount = sheet1.getLastRowNum() + 1;
		  System.out.println("Row Count :- " + rowCount);
			  
			  
			  
			  
		  }
		/*
		 * String initialxls = sheet1.getRow(1).getCell(0).getStringCellValue(); String
		 * firstnamexls = sheet1.getRow(1).getCell(1).getStringCellValue(); String
		 * middlenamexls = sheet1.getRow(1).getCell(2).getStringCellValue();
		 */
				
	  
	  
	  
	public static void NormalActions() throws InterruptedException {
		
		WebElement title = driver.findElement(By.id("TitleId"));
		WebElement initial = driver.findElement(By.id("Initial"));
		WebElement firstName = driver.findElement(By.id("FirstName"));
		WebElement middleName = driver.findElement(By.id("MiddleName"));
		WebElement gender = driver.findElement(By.name("Female"));
		WebElement languages = driver.findElement(By.name("english"));
		WebElement savebtn	= driver.findElement(By.name("Save"));
		WebElement generatebtn = driver.findElement(By.name("generate"));
		
		MouseActions.dropdownvalues(title, "1");
		/*
		 * Select obj = new Select(title); obj.selectByValue("1");
		 */
		
		initial.sendKeys("h");
		firstName.sendKeys("Gokul");
		middleName.sendKeys("Krishnan");
		gender.click();
		languages.click();
		savebtn.click();
		
		
		generatebtn.click();
		
		MouseActions.popup();
		
		Thread.sleep(3000);
		
		MouseActions.MouseHover();
		
		Thread.sleep(4000);
		
		driver.quit();
		
	}
	
	
	public static void popup() {
		
		
		String a = driver.switchTo().alert().getText();
		
		System.out.println("First popup value is : " + a);
		
		driver.switchTo().alert().dismiss();
		
		String b = driver.switchTo().alert().getText();
		
		System.out.println("First popup value is : " +b);
		
		driver.switchTo().alert().accept();
		
		
		
	}
	
	
	public static void MouseHover() throws InterruptedException {
		
		System.out.println("MouseHoverActionDone");
		
		Actions action = new Actions(driver);
		
		WebElement automationTool = driver.findElement(By.xpath(("//*[@id='cssmenu']/ul/li[2]")));
		
		WebElement selenium = driver.findElement(By.id("Selenium"));
		
		WebElement seleniumwebdriver = driver.findElement(By.id("Selenium WebDriver"));
		
		action.moveToElement(automationTool).build().perform();
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(selenium));
		
		action.moveToElement(selenium).build().perform(); 
		
		Thread.sleep(1000);
		
		seleniumwebdriver.click();		
		
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		

		/*
		 * MouseActions.browserLaunch("http://executeautomation.com/demosite/index.html"
		 * ); MouseActions.NormalActions();
		 */
		MouseActions.XLSheetWorkbook();
		
		
	}

}
