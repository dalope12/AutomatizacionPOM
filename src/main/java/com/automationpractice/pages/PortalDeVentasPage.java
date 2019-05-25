package com.automationpractice.pages;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://automationpractice.com/index.php")
public class PortalDeVentasPage extends PageObject {

	@FindBy(xpath = "(//*[text()='Dresses'])[2]")
	WebElementFacade btnDresses;

	public void clickBotonDresses() {
		btnDresses.click();
	}

}
