package com.sakara.pharmeasy.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class PatientModule {
	@Test
	public void createPatient() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.fb.com");
		
		Reporter.log(driver.getTitle(), true);
		driver.quit();
	}
	// public static void main(String[] args) {
	// System.setProperty("webdriver.chrome.driver",
	// "./src/main/resources/drivers/chromedriver.exe");
	// WebDriver driver=new ChromeDriver();
	// driver.manage().window().maximize();
	//// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	//// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//// WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	//// WebDriverWait wait=new WebDriverWait(driver, 10);
	// driver.get("https://www.fb.com");
	// Actions a=new Actions(driver);
	//// a.scrollByAmount(0, 100).perform();
	//// driver.manage().window().minimize();
	// driver.quit();
	//
	// }
}
