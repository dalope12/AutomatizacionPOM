package com.automationpractice.stepdefinitions;

import static com.automationpractice.exceptions.OrdenNoConfirmada.LA_ORDEN_NO_ESTA_CONFIRMADA;
import static com.automationpractice.userinterfaces.PortalDeVentasPage.URL;
import static com.automationpractice.userinterfaces.ShoppingPage.EMAIL;
import static com.automationpractice.userinterfaces.ShoppingPage.PASSWORD;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

import org.openqa.selenium.WebDriver;

import com.automationpractice.exceptions.OrdenNoConfirmada;
import com.automationpractice.questions.ElTexto;
import com.automationpractice.tasks.Acceder;
import com.automationpractice.tasks.Acepta;
import com.automationpractice.tasks.Capturar;
import com.automationpractice.tasks.Confirma;
import com.automationpractice.tasks.ConfirmarLa;
import com.automationpractice.tasks.Elegir;
import com.automationpractice.tasks.Ingresar;
import com.automationpractice.tasks.IngresarCredenciales;
import com.automationpractice.tasks.Procede;
import com.automationpractice.tasks.SeleccionarElVestido;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;

public class Comprar_vestido_definitions {

	@Managed(driver = "chrome", options = "--start-maximized, --incognito,--test-type")
	private WebDriver driver;

	@Before
	public void before() {
		OnStage.setTheStage(new OnlineCast());
	}

	@Given("^(.*) esta en el portal de ventas en la opcion DRESSES$")
	public void elUsuarioEstaEnElPortalDeVentasEnLaOpcionDRESSES(String usuario) {
		theActorCalled(usuario).wasAbleTo(Ingresar.alPortalDeVentasCon(driver, URL), Acceder.aLaOpcionDresses());
	}

	@When("^Selecciona el vestido mas costoso$")
	public void seleccionaElVestidoMasCostoso() {
		theActorInTheSpotlight().attemptsTo(SeleccionarElVestido.masCostosoYAgregarAlCarrito());
	}

	@When("^realiza el proceso de compra$")
	public void realizaElProcesoDeCompra() {
		theActorInTheSpotlight().attemptsTo(Procede.aLaCompra(), IngresarCredenciales.deInicioDeSesion(EMAIL, PASSWORD),
				Confirma.direccion(), Acepta.losTerminos());
	}

	@Then("^finaliza la compra$")
	public void finalizaLaCompra() {
		theActorInTheSpotlight().attemptsTo(Elegir.elMetodoDePago(), ConfirmarLa.orden());
		theActorInTheSpotlight()
				.should(seeThat(ElTexto.deLaConfirmacionDeLaOrden(), equalTo("Your order on My Store is complete."))
						.orComplainWith(OrdenNoConfirmada.class, LA_ORDEN_NO_ESTA_CONFIRMADA));
	}

	@Then("^obtiene el comprobante de la transaccion en un archivo de texto$")
	public void obtieneElComprobanteDeLaTransaccionEnUnArchivoDeTexto() {
		theActorInTheSpotlight().attemptsTo(Capturar.elComprobante());
	}

}
