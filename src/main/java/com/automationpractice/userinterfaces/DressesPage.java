package com.automationpractice.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class DressesPage {

	public static final Target TXT_VALOR_DEL_VESTIDO = Target.the("Texto del valor de los vestidos.")
			.locatedBy("(//div[@class='right-block']//span[@itemprop='price'])[2]");
	public static final Target ADD_TO_CART = Target.the("Botón para agregar al carrito.")
			.locatedBy("//*/a[@data-id-product='4']/span[text()='Add to cart']");
	public static final Target BOTON_PROCEED_TO_CHECKOUT = Target.the("Botón proceed to checkout")
			.locatedBy("//*[contains(text(),'Proceed to checkout')]");
}
