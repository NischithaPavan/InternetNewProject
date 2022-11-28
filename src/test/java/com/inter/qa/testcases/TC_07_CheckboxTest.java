package com.inter.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.inter.qa.base.TestBase;
import com.inter.qa.pages.TC_06_DragAndDrop;
import com.inter.qa.pages.TC_07_Checkbox;

public class TC_07_CheckboxTest extends TestBase {
	
	TC_07_Checkbox checkbox;
	
	
	public TC_07_CheckboxTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@BeforeMethod
	public void setup() throws IOException{
		
		initialization();
		checkbox=new TC_07_Checkbox();
		
    }
	@Test
	public void verifyCheckboxTest() throws InterruptedException {
		checkbox.verifycheckbox();
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	

}
