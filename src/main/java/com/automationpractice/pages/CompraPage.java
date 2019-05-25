package com.automationpractice.pages;

import static com.automationpractice.utils.CapturarComprobante.CapturarComprobanteDePago;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CompraPage extends PageObject {

	@FindBy(xpath = "(//*[contains(text(),'Proceed to checkout')])[2]")
	WebElementFacade btnCheckout;

	@FindBy(xpath = "//*[@id='email']")
	WebElementFacade txtEmail;

	@FindBy(xpath = "//*[@id='passwd']")
	WebElementFacade txtPassword;

	@FindBy(xpath = "//*[@id='SubmitLogin']")
	WebElementFacade btnSignIn;

	@FindBy(xpath = "//*[@id='cgv']")
	WebElementFacade checkAceptar;

	@FindBy(xpath = "//*[@title='Pay by bank wire']")
	WebElementFacade btnMetodoPago;

	@FindBy(xpath = "//*[text()='I confirm my order']")
	WebElementFacade btnConfirmarOrden;

	@FindBy(xpath = "//*[@id='center_column']/div")
	WebElementFacade txtComprobante;

	public void clickBotonCheckout() {
		btnCheckout.waitUntilVisible();
		btnCheckout.waitUntilEnabled();
		btnCheckout.click();
	}
	
	public void ingresarCredenciales(String user, String password) {
		txtEmail.sendKeys(user);
		txtPassword.sendKeys(password);
		btnSignIn.click();

	}

	public void aceptar() {
		checkAceptar.click();
		btnCheckout.click();
	}

	public void clickMetodoDePago() {
		btnMetodoPago.click();
	}

	public void clickConfirmarOrden() {
		btnConfirmarOrden.click();
	}

	public void capturarComprobante() {
		String texto;
		texto = txtComprobante.getText();
		CapturarComprobanteDePago(texto);
	}
}
