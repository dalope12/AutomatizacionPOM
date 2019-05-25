package com.automationpractice.tasks;

import static com.automationpractice.userinterfaces.ShoppingPage.BOTON_PROCEED_TO_CHECKOUT;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Procede implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {

		BOTON_PROCEED_TO_CHECKOUT.resolveFor(actor).waitUntilVisible();
		BOTON_PROCEED_TO_CHECKOUT.resolveFor(actor).waitUntilEnabled();
		actor.attemptsTo(Click.on(BOTON_PROCEED_TO_CHECKOUT));
	}

	public static Procede aLaCompra() {
		return Tasks.instrumented(Procede.class);
	}

}
