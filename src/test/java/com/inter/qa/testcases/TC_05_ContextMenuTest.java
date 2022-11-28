package com.inter.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.inter.qa.base.TestBase;
import com.inter.qa.pages.TC_03_AuthenticationPopup;
import com.inter.qa.pages.TC_05_ContextMenu;

public class TC_05_ContextMenuTest extends TestBase {
	
	TC_05_ContextMenu contextmenu;
	public TC_05_ContextMenuTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@BeforeMethod
	public void setup() throws IOException{
		
		initialization();
		 contextmenu=new TC_05_ContextMenu();
		
	}
	
	@Test
	public void verifyContextMenuTest() throws InterruptedException {
		contextmenu.verifyContextMenu();
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
