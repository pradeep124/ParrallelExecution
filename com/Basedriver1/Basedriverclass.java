package com.Basedriver1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Basedriverclass {

	public static WebDriver driver;
	
	 
	  
	  public void launchurl() throws InterruptedException, IOException
	  {
	  System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
	   driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(30,
	  TimeUnit.SECONDS); Thread.sleep(2000);
	  System.out.println("Starting the suite");
	  driver.get("http://newtours.demoaut.com/mercurywelcome.php");
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies(); Thread.sleep(2000);
	  System.out.println("Launching the URL");
	  }
	 
	 
	 public void closethebrowser() {
		 driver.close();
		 driver.quit();
	 }
}
	
	

