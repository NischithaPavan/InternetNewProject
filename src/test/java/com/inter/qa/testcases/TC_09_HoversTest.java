package com.inter.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.inter.qa.base.TestBase;
import com.inter.qa.pages.TC_08_SelectDropDown;
import com.inter.qa.pages.TC_09_Hovers;

public class TC_09_HoversTest extends TestBase {
	
	TC_09_Hovers hovers;
	
	
	public TC_09_HoversTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@BeforeMethod
	public void setup() throws IOException{
		
		initialization();
		hovers=new TC_09_Hovers();
    }
	@Test
	public void verifyhovertexttest() {
		
		hovers.verifyhovertext();
		
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
