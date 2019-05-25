package com.automationpractice.tasks;

import static com.automationpractice.userinterfaces.ShoppingPage.BOTON_SIGN_IN;
import static com.automationpractice.userinterfaces.ShoppingPage.INPUT_EMAIL;
import static com.automationpractice.userinterfaces.ShoppingPage.INPUT_PASSWORD;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class IngresarCredenciales implements Task {

	private String email;
	private String password;

	public IngresarCredenciales(String email, String password) {
		this.email = email;
		this.password = password;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(email).into(INPUT_EMAIL), Enter.theValue(password).into(INPUT_PASSWORD),
				Click.on(BOTON_SIGN_IN));
	}

	public static IngresarCredenciales deInicioDeSesion(String email, String password) {
		return Tasks.instrumented(IngresarCredenciales.class, email, password);
	}

}
