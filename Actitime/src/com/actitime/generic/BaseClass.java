package com.actitime.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;

import com.actitime.pom.Home;
import com.actitime.pom.Login;

public class BaseClass {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public static WebDriver driver;
	@BeforeClass
	public void openBrowser() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	
	@BeforeMethod
	public void loginPage() throws IOException {
		FileLib f=new FileLib();
		String url = f.getPropertyData("url");
		System.out.println(url);
		String user = f.getPropertyData("username");
		System.out.println(user);
		String pass = f.getPropertyData("password");
		System.out.println(pass);
		
		driver.get(url);
	Login l=new Login(driver);
	
		l.setLogin(user, pass);
	}
	
	
	
	@AfterMethod
	public void logoutPage() throws InterruptedException {
		Thread.sleep(5000);
		Home h=new Home(driver);
		//h.setLogout();
	}
	
	@AfterClass
	public void closeBrowser() {
	//	driver.quit();;
		
	}
		
		
		
	
}




