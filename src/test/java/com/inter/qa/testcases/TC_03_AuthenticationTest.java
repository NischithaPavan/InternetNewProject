package com.inter.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.inter.qa.base.TestBase;
import com.inter.qa.pages.TC_02_AddAndRemove;
import com.inter.qa.pages.TC_03_AuthenticationPopup;

public class TC_03_AuthenticationTest extends TestBase {
	
	TC_03_AuthenticationPopup authpop;
	
	public TC_03_AuthenticationTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@BeforeMethod
	public void setup() throws IOException{
		
		initialization();
		authpop=new TC_03_AuthenticationPopup();
		
	}
	@Test
	public void verifyAuth() throws InterruptedException {
		authpop.verifyAuthPopup();
		
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
