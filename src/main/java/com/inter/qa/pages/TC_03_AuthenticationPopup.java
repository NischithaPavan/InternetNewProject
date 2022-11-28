package com.inter.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.inter.qa.base.TestBase;
import com.inter.qa.util.TestUtil;

public class TC_03_AuthenticationPopup extends TestBase{
	
	@FindBy(xpath="//a[text()='Basic Auth']")
	WebElement clickOnBasicAuth;
	
	public TC_03_AuthenticationPopup() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	public void verifyAuthPopup() throws InterruptedException {
		TestUtil.click(clickOnBasicAuth, driver);
		Thread.sleep(5000);
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		Thread.sleep(6000);
	}

}
