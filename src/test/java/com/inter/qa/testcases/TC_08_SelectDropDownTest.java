package com.inter.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.inter.qa.base.TestBase;
import com.inter.qa.pages.TC_07_Checkbox;
import com.inter.qa.pages.TC_08_SelectDropDown;

public class TC_08_SelectDropDownTest extends TestBase {
	
	TC_08_SelectDropDown selectdropdown;
	
	
	public TC_08_SelectDropDownTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@BeforeMethod
	public void setup() throws IOException{
		
		initialization();
		selectdropdown=new TC_08_SelectDropDown();
    }
	@Test
	public void verifySelectdropdowntest() throws InterruptedException {
		selectdropdown.verifyselectdropdown();
		
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
