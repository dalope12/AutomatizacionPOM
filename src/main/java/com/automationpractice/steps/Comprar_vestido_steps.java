package com.automationpractice.steps;

import com.automationpractice.pages.CompraPage;
import com.automationpractice.pages.DressesPage;
import com.automationpractice.pages.PortalDeVentasPage;

import net.thucydides.core.annotations.Step;

public class Comprar_vestido_steps {

	PortalDeVentasPage portalDeVentasPage;
	DressesPage dressesPage;
	CompraPage compraPage;

	public void abrir() {
		portalDeVentasPage.open();
	}

	@Step
	public void elegirLaOpcionDresses() {
		portalDeVentasPage.clickBotonDresses();
	}

	@Step
	public void seleccionarElVestido() {
		dressesPage.clickElVestidoMasCostoso();
		dressesPage.clickBotonCheckout();
	}

	@Step
	public void realizarElProcesoDeCompra() {
		compraPage.clickBotonCheckout();
		compraPage.ingresarCredenciales("megan@qvision.com", "prueba");
		compraPage.clickBotonCheckout();
		compraPage.aceptar();
	}

	@Step
	public void finalizarLaCompra() {
		compraPage.clickMetodoDePago();
		compraPage.clickConfirmarOrden();
	}

	@Step
	public void obtenerElComprobante() {
		compraPage.capturarComprobante();
	}

}
