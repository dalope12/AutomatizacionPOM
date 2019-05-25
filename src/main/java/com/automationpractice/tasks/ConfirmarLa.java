package com.automationpractice.tasks;

import static com.automationpractice.userinterfaces.ShoppingPage.BOTON_CONFIRMAR_ORDEN;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ConfirmarLa implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Click.on(BOTON_CONFIRMAR_ORDEN));

	}

	public static ConfirmarLa orden() {
		return Tasks.instrumented(ConfirmarLa.class);
	}

}
