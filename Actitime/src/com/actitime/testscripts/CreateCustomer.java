package com.actitime.testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.Home;
import com.actitime.pom.Login;
import com.actitime.pom.Task;

@Listeners(com.actitime.generic.ListenerImplementation.class)

public class CreateCustomer extends BaseClass  {
	@Test
	public void createCustomer() throws IOException	{
		
Home h= new Home(driver);
	h.setTask();
	
	Task t=new Task(driver);
	t.setaddNew();
	t.setNewcus();
	
	FileLib f=new FileLib();
	String cusname = f.getExcelData("CreateCustomer", 1, 3);
	String cusdesc = f.getExcelData("CreateCustomer", 1, 4);
	t.setNewcustext(cusname);
	t.setCusdes(cusdesc);
		t.setSelect();
		t.setOurcom();
		t.setFinall();
	String actualcus = t.getTam().getText();
		System.out.println(actualcus);
	Assert.assertEquals(actualcus, cusname);
		
	}	
}





