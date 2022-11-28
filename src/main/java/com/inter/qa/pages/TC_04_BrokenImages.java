package com.inter.qa.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.inter.qa.base.TestBase;

public class TC_04_BrokenImages extends TestBase {
	
	@FindBy(xpath="//div[@class='example']/h3/following-sibling::img")
	List<WebElement> brokenlinks;
	
	public TC_04_BrokenImages() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	
	public void verifyBrokenlinks() {
		
		
	}

}
