package com.Flows;

import org.testng.Assert;

import com.Basedriver1.Basedriverclass;
import com.Pages.Loginpage;

public class Loginflow extends Basedriverclass {

	
Loginpage pl=new Loginpage();
	
	public void login() {
		pl.getTx_username().sendKeys("pradeephnk@gmail.com");
		
		String actualusername=pl.getTx_username().getAttribute("value");
		//Assert.assertEquals("pradeephnk@gmail.com", actualusername);
		
		pl.getTx_password().sendKeys("Hansika2010");
		
		String actualpassword=pl.getTx_password().getAttribute("value");
		//Assert.assertEquals("Hansika2010", actualpassword);
		
		
		
		pl.getBtn_login().click();
	}
}
