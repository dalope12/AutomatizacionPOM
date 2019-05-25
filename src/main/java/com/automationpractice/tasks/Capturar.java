package com.automationpractice.tasks;

import static com.automationpractice.utils.CapturarComprobante.CapturarComprobanteDePago;

import com.automationpractice.userinterfaces.ShoppingPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class Capturar implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		String texto;
		texto = ShoppingPage.TEXTO_COMPROBANTE.resolveFor(actor).getText();
		CapturarComprobanteDePago(texto);
	}

	public static Capturar elComprobante() {
		return Tasks.instrumented(Capturar.class);
	}

}
