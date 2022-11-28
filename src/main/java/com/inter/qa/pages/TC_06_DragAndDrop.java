package com.inter.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.inter.qa.base.TestBase;
import com.inter.qa.util.TestUtil;

public class TC_06_DragAndDrop extends TestBase {
	
	@FindBy(xpath="//div[@id='column-a']/header")
	WebElement drag;
	
	@FindBy(xpath="//div[@id='column-b']/header")
	WebElement drop;
	
	@FindBy(xpath="//a[text()='Drag and Drop']")
	WebElement clickOnDragAndDrop;
	
	
	public TC_06_DragAndDrop() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	public void verifyDragAndDrop() throws InterruptedException {
		TestUtil.click(clickOnDragAndDrop, driver);
		Thread.sleep(5000);
		Actions action=new Actions(driver);
		action.dragAndDrop(drag,drop).build().perform();
		
	}

}
