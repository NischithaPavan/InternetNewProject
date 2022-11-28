package com.inter.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.inter.qa.base.TestBase;
import com.inter.qa.pages.TC_06_DragAndDrop;

public class TC_06_DragAndDropTest extends TestBase {

	TC_06_DragAndDrop draganddrop;
	
	
	public TC_06_DragAndDropTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@BeforeMethod
	public void setup() throws IOException{
		
		initialization();
		draganddrop=new TC_06_DragAndDrop();
		
    }
	
	@Test
	public void verifyDragAndDropTest() throws InterruptedException {
		draganddrop.verifyDragAndDrop();
		
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
