package com.automationpractice.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PortalDeVentasPage {

	public static final String URL = "http://automationpractice.com/index.php";
	public static final Target BOTON_DRESSES = Target.the("Botón de la opción dresses.")
			.locatedBy("(//*[text()='Dresses'])[2]");
}
