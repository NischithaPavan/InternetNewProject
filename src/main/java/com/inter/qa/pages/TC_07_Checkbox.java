package com.inter.qa.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.inter.qa.base.TestBase;
import com.inter.qa.util.TestUtil;

public class TC_07_Checkbox extends TestBase{
	
	@FindBy(xpath="//a[text()='Checkboxes']")
	WebElement clickonCheckbox;
	
	@FindBy(xpath="//form[@id='checkboxes']/input")
	List<WebElement> checkbox;
	
	public TC_07_Checkbox () throws IOException{
		PageFactory.initElements(driver,this);
	}
	public void verifycheckbox() throws InterruptedException {
		TestUtil.click(clickonCheckbox, driver);
		
		for(WebElement chk:checkbox) {
			if(!chk.isSelected()) {
				TestUtil.click(chk, driver);
				Thread.sleep(4000);
			}
		}
		
	}

	  
	
	

}
