package com.inter.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.inter.qa.base.TestBase;
import com.inter.qa.util.TestUtil;

public class TC_01_TextValidation extends TestBase{
	@FindBy(xpath="//div[@class='example']/h3/following-sibling::p")
	public WebElement txtmessage;
	
	@FindBy(xpath="//a[text()='A/B Testing']")
	public WebElement clickOnABTesting;
	
	public TC_01_TextValidation() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	
	public String verifyTextMessage() {
		TestUtil.click(clickOnABTesting, driver);
		
		String str=txtmessage.getText();
		System.out.println(str);
		return str;
		
	}
	
}
	


