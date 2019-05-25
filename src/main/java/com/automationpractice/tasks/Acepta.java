package com.automationpractice.tasks;

import static com.automationpractice.userinterfaces.ShoppingPage.BOTON_PROCEED_TO_CHECKOUT;
import static com.automationpractice.userinterfaces.ShoppingPage.CHECKBOX;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Acepta implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(CHECKBOX), Click.on(BOTON_PROCEED_TO_CHECKOUT));
	}

	public static Acepta losTerminos() {
		return Tasks.instrumented(Acepta.class);
	}

}
