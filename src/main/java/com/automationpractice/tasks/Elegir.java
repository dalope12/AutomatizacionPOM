package com.automationpractice.tasks;

import static com.automationpractice.userinterfaces.ShoppingPage.BOTON_PAGAR_POR_BANCO;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Elegir implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(BOTON_PAGAR_POR_BANCO));

	}

	public static Elegir elMetodoDePago() {
		return Tasks.instrumented(Elegir.class);
	}
}
