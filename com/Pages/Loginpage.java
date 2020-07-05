package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Basedriver1.Basedriverclass;

public class Loginpage extends Basedriverclass{

	
	@FindBy(name = "userName")
	WebElement tx_username;

	@FindBy(name = "password")
	WebElement tx_password;

	@FindBy(name = "login")
	WebElement btn_login;

	
	public  Loginpage() {
		PageFactory.initElements(driver, this);
	}


	public WebElement getTx_username() {
		return tx_username;
	}


	public void setTx_username(WebElement tx_username) {
		this.tx_username = tx_username;
	}


	public WebElement getTx_password() {
		return tx_password;
	}


	public void setTx_password(WebElement tx_password) {
		this.tx_password = tx_password;
	}


	public WebElement getBtn_login() {
		return btn_login;
	}


	public void setBtn_login(WebElement btn_login) {
		this.btn_login = btn_login;
	}
	
}
