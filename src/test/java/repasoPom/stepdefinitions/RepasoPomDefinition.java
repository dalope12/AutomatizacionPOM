package repasoPom.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import repasoPom.steps.RepasoPomSteps;

public class RepasoPomDefinition {

	@Steps
	RepasoPomSteps repasoPomSteps;

	@Before
	public void setUp() {
		repasoPomSteps.abrirPaginaDeCompras();
	}

	@Given("^(.*) esta en el portal de ventas$")
	public void elUsuarioEstaEnElPortalDeVentas(String user) {
		
	}

	@When("^agrega al carrito la camisa de mujer (.*)$")
	public void agregaAlCarritoLaCamisaDeMujer(String nombreCamisa) {
		repasoPomSteps.accederAlmenu();
	}

	@Then("^la experiencia lo lleva al '(.*)' y a la url '(.*)'$")
	public void laExperienciaLoLlevaAlYALaUrl(String nombreExperiencia, String url) {
		repasoPomSteps.elegirCamisa();
	}

}
