package com.inter.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.inter.qa.base.TestBase;
import com.inter.qa.pages.TC_01_TextValidation;

import junit.framework.Assert;



public class TC_01_verifyTextValidationTest extends TestBase {
	
	TC_01_TextValidation verifytextvalidation;
	
	
	public TC_01_verifyTextValidationTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@BeforeMethod
	public void setup() throws IOException {
		initialization();
		verifytextvalidation=new TC_01_TextValidation();
		
	}
	@Test
	public void veriftTextmessagetest() {
		verifytextvalidation.verifyTextMessage();
		Assert.assertEquals(verifytextvalidation.txtmessage.getText(),"Also known as split testing. This is a way in which businesses are able to simultaneously test and learn different versions of a page to see which text and/or functionality works best towards a desired outcome (e.g. a user action such as a click-through).");
	}
	
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
