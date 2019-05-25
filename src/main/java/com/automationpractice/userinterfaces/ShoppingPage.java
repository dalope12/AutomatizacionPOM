package com.automationpractice.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ShoppingPage {
	public static final Target BOTON_PROCEED_TO_CHECKOUT = Target.the("Botón proceed to checkout")
			.locatedBy("(//*[contains(text(),'Proceed to checkout')])[2]");
	public static final Target INPUT_EMAIL = Target.the("Ingreso del texto del correo.").locatedBy("//*[@id='email']");
	public static final String EMAIL = "megan@qvision.com";
	public static final Target INPUT_PASSWORD = Target.the("Ingreso de password.").locatedBy("//*[@id='passwd']");
	public static final String PASSWORD = "prueba";
	public static final Target BOTON_SIGN_IN = Target.the("Botón para iniciar sesión.")
			.locatedBy("//*[@id='SubmitLogin']");
	public static final Target BOTON_CREATE_AN_ACCOUNT = Target.the("Botón create an account.")
			.locatedBy("//button[@id='SubmitCreate']");
	public static final Target CHECKBOX = Target.the("Checkbox para aceptar los términos.")
			.locatedBy("//*[@id=\"cgv\"]");
	public static final Target BOTON_PAGAR_POR_BANCO = Target.the("Botón para pagar por banco.")
			.locatedBy("//*[@title='Pay by bank wire']");
	public static final Target BOTON_CONFIRMAR_ORDEN = Target.the("Botón para confirmar la orden.")
			.locatedBy("//*[text()='I confirm my order']");
	public static final Target TEXTO_COMPROBANTE = Target.the("Texto del comprobante de pago.")
			.locatedBy("//*[@id=\"center_column\"]/div");
	public static final Target TEXTO_CONFIRMACION_DE_LA_ORDEN = Target.the("Texto de la confirmacioón de la orden.")
			.locatedBy("//*[@id=\"center_column\"]/div/p/strong");

}
