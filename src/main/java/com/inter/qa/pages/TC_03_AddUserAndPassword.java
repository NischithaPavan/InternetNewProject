package com.inter.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.inter.qa.base.TestBase;

public class TC_03_AddUserAndPassword extends TestBase{
	
	@FindBy(xpath="//a[text()='Basic Auth']")
	public WebElement clickOnBasicAuth;
	

	public TC_03_AddUserAndPassword() throws IOException {
		
		PageFactory.initElements(driver, this);
	}

}
