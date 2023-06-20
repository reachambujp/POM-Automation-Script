package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.pages.base.BasePage;

public class HomePage extends BasePage {
	
	
	@FindBy(xpath = "//span[contains(@id,userNavLabel)]")
	WebElement userMenuDropdown;
	
	@FindBy(xpath = "//a[@title='Logout']")
	WebElement logOutLabel;
	
	@FindBy(xpath="//span[@id='userNavLabel']") 
	WebElement userMenu;
	
	@FindBy(xpath="//span[@id='userNavLabel']") 
	WebElement baseMenu;
	
	@FindBy(id = "userNav-menuItems")
	WebElement subMenuOptions;
	
	@FindBy(id = "userNav")
	WebElement userNav;
	
	//WebElement baseMenu = driver.findElement(By.id("userNav"));
	public String getMenuTxt() {
		WebElement subMenuOptions = userNav.findElement(By.id("userNav-menuItems"));
		String menuText= subMenuOptions.getText();
		return menuText;
	}
	

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public WebDriver clickUserMenuDD() {
		
		clickAction(userMenuDropdown, "userMenuDropdown");
		log.info("Entered clickUserMenuDD");
		//report.logTestinfo("Entered clickUserMenuDD");
		return driver;
	}

	public void clicklogOutLabel() {
		
		clickAction(logOutLabel, "logOutLabel");
		log.info("Exit clicklogOutLabel");
		//report.logTestinfo("Logout");
	}

	public String getCurrentPageTitle() {
		return getPageTitle();		
	}
	
	public void userMenufield () {
		log.info("Entered userMenufield");
		clickAction(userMenu, "userMenu");
		log.info("Exit userMenufield");
		
	}
	
	public void clickBaseMenu() {
		log.info("Entered userMenufield");
		clickAction(baseMenu, "Base Menu Field ");
		log.info("Exit userMenufield");
	}
	
	
	public void subMenuOptionsGetText() {
		log.info(subMenuOptions.getText());
		log.info("Exit subMenuOptionsGetText");
		//report.logTestPassed("HomePage Functionality Test Passed");
	}
}
