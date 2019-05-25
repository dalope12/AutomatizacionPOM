package com.automationpractice.questions;

import static com.automationpractice.userinterfaces.ShoppingPage.TEXTO_CONFIRMACION_DE_LA_ORDEN;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ElTexto implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {

		return TEXTO_CONFIRMACION_DE_LA_ORDEN.resolveFor(actor).getText();
	}

	public static ElTexto deLaConfirmacionDeLaOrden() {
		return new ElTexto();
	}

}
