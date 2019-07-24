package com.Practice.Selenium.Demo.Site;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupPractice {

	public static WebDriver driver;
	

	public static void BrowserLaunch1(String URL) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\dgubend\\Desktop\\Dhina\\Selenium Project\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get(URL);

		driver.manage().window().maximize();

	}

	public static void popUpHandle() throws InterruptedException {
		
		WebElement custid = driver.findElement(By.name("cusid"));
		
		WebElement submit = driver.findElement(By.name("submit"));
		
		
		custid.sendKeys("1547989");
		
		submit.click();
		
		Thread.sleep(2000);
		
		String alertmessage = driver.switchTo().alert().getText();
		
		System.out.println(alertmessage);
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(4000);
		
		String alertmessage2 = driver.switchTo().alert().getText();
	
		System.out.println(alertmessage2);
		
		driver.switchTo().alert().accept();
		
		driver.quit();
		
		
		
	}
	
	public static void main(String[] args) throws InterruptedException {
	
		PopupPractice.BrowserLaunch1("http://demo.guru99.com/test/delete_customer.php");
		PopupPractice.popUpHandle();

	}

}
