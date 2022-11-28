package com.inter.qa.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.inter.qa.base.TestBase;
import com.inter.qa.util.TestUtil;

public class TC_09_Hovers extends TestBase {
	
	@FindBy(xpath="//a[text()='Hovers']")
	WebElement clickOnHovers;
	
	@FindBy(xpath="//div[@class='figure']")
	WebElement hoverOnImage;
	
	@FindBy(xpath="//div[@class='figcaption']")
    WebElement capturetext;
	
	
	public TC_09_Hovers() throws IOException{
		
		PageFactory.initElements(driver, this);
		
		}
	public void verifyhovertext() {
		
		TestUtil.click(clickOnHovers, driver);
		Actions action=new Actions(driver);
		action.moveToElement(hoverOnImage).build().perform();
		
		String cap=capturetext.getText();
		System.out.println(cap);
	}

}
