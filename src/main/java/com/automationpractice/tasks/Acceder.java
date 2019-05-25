package com.automationpractice.tasks;

import static com.automationpractice.userinterfaces.PortalDeVentasPage.BOTON_DRESSES;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Acceder implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(BOTON_DRESSES));

	}

	public static Acceder aLaOpcionDresses() {
		return Tasks.instrumented(Acceder.class);
	}
}
