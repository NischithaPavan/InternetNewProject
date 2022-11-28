package com.inter.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.inter.qa.base.TestBase;
import com.inter.qa.util.TestUtil;


public class TC_10_FrameHandling extends TestBase {
	
	@FindBy(xpath="//a[text()='Frames']")
	WebElement clickOnFrames;
	
	@FindBy(xpath="//a[text()='iFrame']")
	WebElement clickOniFrame;
	
	
    public TC_10_FrameHandling() throws IOException{
		PageFactory.initElements(driver, this);
	}
	
	public void verifyFrames() {
		TestUtil.click(clickOnFrames, driver);
		TestUtil.click(clickOniFrame, driver);
		
		
	}
	
	

}
