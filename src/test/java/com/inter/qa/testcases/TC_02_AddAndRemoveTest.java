package com.inter.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.inter.qa.base.TestBase;
import com.inter.qa.pages.TC_02_AddAndRemove;

import junit.framework.Assert;

public class TC_02_AddAndRemoveTest extends TestBase {
	
	
	
	TC_02_AddAndRemove tc_02_AddAndRemove;
	
	
	public TC_02_AddAndRemoveTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@BeforeMethod
	public void setup() throws IOException{
		
		initialization();
		tc_02_AddAndRemove=new TC_02_AddAndRemove();
	}
	
	@Test
	public void verifyAddElementBtnTest() throws InterruptedException {
		tc_02_AddAndRemove.verifyAddElementBtn();
	
	}
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	

}
