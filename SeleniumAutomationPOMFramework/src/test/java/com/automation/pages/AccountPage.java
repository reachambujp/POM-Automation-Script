package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.pages.base.BasePage;

public class AccountPage extends BasePage {
	
	
	@FindBy(id= "Account_Tab") WebElement accountLink;
	@FindBy(xpath = "//input[@title='New']")WebElement elementNew;
	@FindBy(xpath= "//*[@id=\"acc2\"]") WebElement accountName;
	@FindBy(xpath="//*[@id=\"acc6\"]")WebElement element;
	@FindBy(xpath = "//select[@id='00NHs00000Djqtn']") WebElement element1; 
	@FindBy(xpath= "//input[@tabindex='34']") WebElement elementSave;

	public AccountPage(WebDriver driver) {
		super(driver);	
	}
	
	public void clickAccountPage() {
		clickAction(accountLink, "Account Link");
		log.info("accountLink field is clicked");
		
	}
	
	public void clickNewLink() {
		jsClickAction(elementNew);
		
	}
	
	
	public void enterAccountName(String accName) {
		enterTextValue(accountName, accName, "Account Name");
		log.info("Account name is Entered");
	}
	
	
	
	public void selectFromTypeLink() {
		selectByVisibilityTextData(element, "Technology Partner", "TypeField");
		
	}
	
	public void selectFromCustomerPriority() {
		selectByVisibilityTextData(element1, "High", "CustomerPriority");
		log.info("Customer Priority (High) is selected from dropdown");
	}
	
	public void saveButton() {
		jsClickAction(elementSave);
	}
	
	
	

}
