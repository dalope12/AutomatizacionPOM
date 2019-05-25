package com.automationpractice.stepdefinitions;

import com.automationpractice.steps.Comprar_vestido_steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class Comprar_vestido_definitions {

	@Steps
	Comprar_vestido_steps comprar_vestido_steps;

	@Before
	public void before() {
		comprar_vestido_steps.abrir();
	}

	@Given("^El usuario esta en el portal de ventas en la opcion DRESSES$")
	public void elUsuarioEstaEnElPortalDeVentasEnLaOpcionDRESSES() {
		comprar_vestido_steps.elegirLaOpcionDresses();
	}

	@When("^Selecciona el vestido mas costoso$")
	public void seleccionaElVestidoMasCostoso() {
		comprar_vestido_steps.seleccionarElVestido();
	}

	@When("^realiza el proceso de compra$")
	public void realizaElProcesoDeCompra() {
		comprar_vestido_steps.realizarElProcesoDeCompra();

	}

	@Then("^finaliza la compra$")
	public void finalizaLaCompra() {
		comprar_vestido_steps.finalizarLaCompra();
	}

	@Then("^obtiene el comprobante de la transaccion en un archivo de texto$")
	public void obtieneElComprobanteDeLaTransaccionEnUnArchivoDeTexto() {
		comprar_vestido_steps.obtenerElComprobante();
	}

}
