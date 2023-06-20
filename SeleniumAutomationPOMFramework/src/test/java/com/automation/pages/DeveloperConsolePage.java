package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.pages.base.BasePage;

public class DeveloperConsolePage extends BasePage {

	@FindBy(xpath = "//*[@id=\"userNav-menuItems\"]/a[3]")
	WebElement developerConsole;

	public DeveloperConsolePage(WebDriver driver) {
		super(driver);

	}

	public void clickDeveloperConsole() {
		clickAction(developerConsole, "developerConsole");
		// waitElementToBeClickable(developerConsole, "DeveloperConsole");
		log.info("developerConsole link is clicked");
		getScreenShotOfThePage();

	}

}
