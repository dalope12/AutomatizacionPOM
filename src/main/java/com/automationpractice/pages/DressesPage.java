package com.automationpractice.pages;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class DressesPage extends PageObject {

	@FindBy(xpath = "(//div[@class='right-block']//span[@itemprop='price'])[2]")
	WebElementFacade txtValorVestido;

	@FindBy(xpath = "//*[contains(text(),'Proceed to checkout')]")
	WebElementFacade btnCheckout;

	public void clickElVestidoMasCostoso() {
		txtValorVestido.click();
	}

	public void clickBotonCheckout() {
		btnCheckout.waitUntilVisible();
		btnCheckout.waitUntilEnabled();
		btnCheckout.click();
	}
}
