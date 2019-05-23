package repasoPom.steps;

import net.thucydides.core.annotations.Step;
import repasoPom.pages.AccederPage;
import repasoPom.pages.IngresarPage;

public class RepasoPomSteps {
	
	IngresarPage ingresarPage;
	AccederPage accederPage;
	
	public void abrirPaginaDeCompras() {
		ingresarPage.open();
	}

	@Step
	public void accederAlmenu() {
		accederPage.alMenu();
	}
	
	@Step
	public void elegirCamisa() {
		accederPage.seleccionarElProducto();
	}
}
