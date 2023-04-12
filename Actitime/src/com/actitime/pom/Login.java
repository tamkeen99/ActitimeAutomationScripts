package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.BaseClass;

public class Login {

	WebDriver driver;
	
	
	@FindBy(id="username")
	private WebElement user;
	
	@FindBy(name = "pwd")
	private WebElement password;
	
	
	@FindBy(xpath = "//div[text()='Login ']")
	private WebElement loginbutton;
	  
	public void setLogin(String un , String pw) {
		user.sendKeys(un);
		password.sendKeys(pw);
		loginbutton.click();
	}
	
	
	public Login(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	
}

