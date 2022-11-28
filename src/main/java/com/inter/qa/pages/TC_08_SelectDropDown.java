package com.inter.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.inter.qa.base.TestBase;
import com.inter.qa.util.TestUtil;

public class TC_08_SelectDropDown extends TestBase {
	
	@FindBy(xpath="//select[@id='dropdown']")
	WebElement clickOnselectoption;
	
	@FindBy(xpath="//a[text()='Dropdown']")
	WebElement clickOnDropdown;
	
	
	
	public TC_08_SelectDropDown() throws IOException{
		PageFactory.initElements(driver, this);
		
		
	}
	
	public void verifyselectdropdown() throws InterruptedException {
		TestUtil.click(clickOnDropdown, driver);
		Thread.sleep(5000);
		TestUtil.selectValueFromDropDownBy(driver, clickOnselectoption);
		Thread.sleep(5000);
	}

}
