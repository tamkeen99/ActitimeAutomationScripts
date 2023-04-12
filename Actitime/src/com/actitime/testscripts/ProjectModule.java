package com.actitime.testscripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.Home;
import com.actitime.pom.Task;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class ProjectModule extends BaseClass {
	
	@Test
	public void createProject() throws IOException {
		
		Home h=new Home(driver);
		h.setTask();
		
		Task t= new Task(driver);
		t.setaddNew();
		t.setnewProject();
		
		FileLib f= new FileLib();
		String proname = f.getExcelData("CreateProject", 1, 3);
		String prodes = f.getExcelData("CreateProject", 1, 4);
		
		t.setproName(proname);
		t.setproDes(prodes);
		
		t.setselectCus();
		t.setourCompro();
		t.setcreatePro();
		
		String temppro = t.setText1().getText();
		Assert.assertEquals(prodes, temppro);
	}

}
