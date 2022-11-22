package com.inter.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.inter.qa.base.TestBase;
import com.inter.qa.util.TestUtil;

public class TC_02_AddAndRemove extends TestBase{
	@FindBy(xpath="//a[text()='Add/Remove Elements']")
	public WebElement clickOnAddbtn;
	
	@FindBy(xpath="//button[text()='Add Element']")
	public WebElement clickOnAddElementBtn;
	
	@FindBy(xpath="//button[text()='Delete']")
	public WebElement clickOnDeleteBtn;
	
	
	public TC_02_AddAndRemove() throws IOException {
		
		PageFactory.initElements(driver, this);
	}
	
	public void verifyAddElementBtn() throws InterruptedException {
		TestUtil.click(clickOnAddbtn, driver);
		TestUtil.click(clickOnAddElementBtn, driver);
		Thread.sleep(3000);
		if(clickOnDeleteBtn.isDisplayed()) {
			TestUtil.click(clickOnDeleteBtn, driver);
		}
	}
	

}
