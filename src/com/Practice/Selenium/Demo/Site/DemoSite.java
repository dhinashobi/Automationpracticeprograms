package com.Practice.Selenium.Demo.Site;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoSite {
	
	  public static WebDriver driver;
	  
	  public static String URL = "https://www.toolsqa.com/automation-practice-form/";
	 
	  
	  
	public static void BrowserLaunch(String URL) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\dgubend\\Desktop\\Dhina\\Selenium Project\\chromedriver_win32\\chromedriver.exe");

		
		  driver = new ChromeDriver();
		  
		  driver.get(URL);
		  
		  driver.manage().window().maximize();
		 

	}

	public static void ToolsQA() throws InterruptedException {

		WebElement partialtext = driver.findElement(By.partialLinkText("Partial Link Test"));
		partialtext.click();
		Thread.sleep(2000);

		WebElement linktext = driver.findElement(By.linkText("Link Test"));

		linktext.click();
		
		Thread.sleep(2000);

		DemoSite.mouseHover();

		Thread.sleep(2000);

	    WebElement firstname = driver.findElement(By.xpath("//*[@id=\'content\']/div[1]/div/div/div/div[2]/div/form/fieldset/div[8]/input"));

		WebElement lastname = driver.findElement(By.name("lastname"));

		WebElement sex = driver.findElement(By.id("sex-0"));

		WebElement yearsofExperiance = driver.findElement(By.id("exp-0"));

		WebElement datepicker = driver.findElement(By.id("datepicker"));

		WebElement profession = driver.findElement(By.id("profession-0"));

		WebElement automateTool = driver.findElement(By.id("tool-2"));

		WebElement button = driver.findElement(By.id("submit"));

		WebElement filesToDownload = driver.findElement(By.linkText("Test File to Download"));

		firstname.sendKeys("Gokul");
		
		lastname.sendKeys("Krishnan");
		sex.click();
		yearsofExperiance.click();
		datepicker.sendKeys("12/08/2019");
		profession.click();
		filesToDownload.click();
		automateTool.click();
		button.click();
		driver.quit();
	}

	public static void mouseHover() {

		Actions action = new Actions(driver);

		WebElement Demosite = driver.findElement(By.xpath("//*[@id=\'primary-menu\']/li[7]/a/span/span"));

		action.moveToElement(Demosite).perform();

		WebDriverWait wait = new WebDriverWait(driver, 20);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\'primary-menu\']/li[7]/ul/li[3]/a/span/span")));

		
		  WebElement aPF = driver.findElement(By.xpath("//*[@id=\'primary-menu\']/li[7]/ul/li[3]/a/span/span"));
		  
		  aPF.click();
		 

	}

	public static void main(String[] args) throws InterruptedException {

		DemoSite.BrowserLaunch("https://www.toolsqa.com/automation-practice-form/");
		DemoSite.ToolsQA();

	}

}
