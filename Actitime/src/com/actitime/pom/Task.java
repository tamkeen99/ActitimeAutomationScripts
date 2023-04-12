package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task {
 WebDriver driver;
 
 @FindBy(xpath = "//div[@class='title ellipsis']")
 private WebElement task;
 
 public void setaddNew() {
	 task.click();
 }
 
 @FindBy(xpath = "//div[@class='item createNewCustomer']")
 private WebElement newcus;
 
 public void setNewcus() {
	 newcus.click();
 }
 
 @FindBy(xpath = "//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")
 private WebElement newcustext;
 
 public void setNewcustext(String text) {
	 newcustext.sendKeys(text);
 }
 
 @FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
 private WebElement cusdes;
 
 public void setCusdes(String cusdes) {
	this. cusdes.sendKeys(cusdes);
 }
 
	@FindBy(xpath = "//div[@class='emptySelection']")
	private WebElement select;
	
	public void setSelect() {
		select.click();
	}
 
 @FindBy(xpath = "//div[@class='itemRow cpItemRow '][normalize-space()='Our company']")
 private WebElement ourcom;
 
 
 public void setOurcom() {
	 ourcom.click();
 }
 
 
 @FindBy(xpath = "//div[contains(text(),'Create Customer')]")
 private WebElement finall;
  
 public void setFinall() {
	 finall.click();
 }
 
 
 @FindBy(xpath = "//div[contains(text(),'Tamkeen') and @class='title']")
 private WebElement tam;
 
 public WebElement getTam() {
 return tam;
 } 
 
 
 public Task(WebDriver driver) {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
 }
	 
	 @FindBy(xpath = "//div[@class='item createNewProject']")
	 private WebElement newproject;
	 
public void setnewProject() {	 
	newproject.click();
}


@FindBy(xpath = "//input[@class='projectNameField inputFieldWithPlaceholder inputNameField']")
private WebElement proname;

public void setproName(String pronamee ) {
	proname.sendKeys(pronamee);
}
	 
@FindBy(xpath = "//textarea[@placeholder='Add Project Description']")	 
	 private WebElement prodes;


public void setproDes(String prodess) {
	prodes.sendKeys(prodess);
	
	
}
 @FindBy(xpath = "//div[text()='-- Please Select Customer to Add Project for  --']")
	 private WebElement selectcus;
 
 public void setselectCus() {
	 selectcus.click();
	
}
	 
	 @FindBy(xpath = "//div[contains(@class,'itemRow cpItemRow')][normalize-space()='Our company']")
	 private WebElement ourcom1;
	 
	 public void setourCompro() {
		 ourcom1.click();
		
	}
	 
	 
	 @FindBy(xpath = "//div[contains(text(),'Create Project')]")
	 private WebElement createpro;
	 
	 public void setcreatePro() {
		 createpro.click();
		
	}
	 @FindBy(xpath = "(//div[contains(text(),'Banking3 project')])[2]")
	 private WebElement text1;
	 
	 public WebElement setText1() {
		 return text1;
		
	}
 }

 

