package repasoPom.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class AccederPage extends PageObject{
	
	@FindBy(xpath="//*[text()='Women']")
	WebElementFacade btnWomen;
	
	@FindBy(xpath="//*/a[contains(text(),'Faded Short Sleeve T-shirts')]")
	WebElementFacade btnTShirts;

	public void alMenu() {
		btnWomen.click();
	}
	
	public void seleccionarElProducto() {
		btnTShirts.click();
	}
}
