package com.Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Basedriver1.Basedriverclass;
import com.Flows.Loginflow;

public class Testcase2  extends Basedriverclass{

	
	 @Test
	 
	 
		public void tc1() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(30,
		  TimeUnit.SECONDS); Thread.sleep(2000);
		  System.out.println("Starting the suite");
		  driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies(); Thread.sleep(2000);
		  System.out.println("Launching the URL");
		  driver.findElement(By.name("userName")).sendKeys("Pradeephnk@gmail.com");
		  driver.quit();
	 }
	
}

