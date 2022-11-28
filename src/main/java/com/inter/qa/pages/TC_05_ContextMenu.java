package com.inter.qa.pages;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.inter.qa.base.TestBase;
import com.inter.qa.util.TestUtil;

public class TC_05_ContextMenu extends TestBase{
	
	@FindBy(xpath="//div[@id='hot-spot']")
	WebElement clikOnContext ;
	
	@FindBy(xpath="//a[text()='Context Menu']")
	WebElement clickonContextMenu;
	
	public TC_05_ContextMenu() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	
	public void verifyContextMenu() throws InterruptedException {
		
		TestUtil.click(clickonContextMenu, driver);
		Actions action=new Actions(driver);
		action.moveToElement(clikOnContext);
		Thread.sleep(9000);
		action.contextClick(clikOnContext).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(9000);
		String message=driver.switchTo().alert().getText();
		System.out.println(message);
		driver.switchTo().alert().accept();
		Thread.sleep(9000);
		
	}

}
