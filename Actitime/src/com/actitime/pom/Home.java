package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	
	
	WebDriver driver;
	
	@FindBy(xpath = "//div[@id='container_tasks']")
private WebElement task;
	
	
	public void setTask() {
		task.click();
	}
	
	@FindBy(linkText = "Logout")
	private WebElement logout;
	
	public void  setLogout() {
		
		logout.click();
	}
		
		 public Home(WebDriver driver) {
			 this.driver=driver;
			 PageFactory.initElements(driver, this);
		
		
	}
	
	
	
	
}