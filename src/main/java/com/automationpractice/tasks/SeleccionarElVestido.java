package com.automationpractice.tasks;

import static com.automationpractice.userinterfaces.DressesPage.BOTON_PROCEED_TO_CHECKOUT;
import static com.automationpractice.userinterfaces.DressesPage.TXT_VALOR_DEL_VESTIDO;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarElVestido implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(TXT_VALOR_DEL_VESTIDO));
		BOTON_PROCEED_TO_CHECKOUT.resolveFor(actor).waitUntilVisible();
		BOTON_PROCEED_TO_CHECKOUT.resolveFor(actor).waitUntilEnabled();
		actor.attemptsTo(Click.on(BOTON_PROCEED_TO_CHECKOUT));
	}

	public static SeleccionarElVestido masCostosoYAgregarAlCarrito() {
		return Tasks.instrumented(SeleccionarElVestido.class);
	}

}
