package com.automationpractice.tasks;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;

public class Ingresar implements Task {

	private WebDriver chrome;
	private String url;

	public Ingresar(WebDriver chrome, String url) {
		this.chrome = chrome;
		this.url = url;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.can(BrowseTheWeb.with(chrome));
		actor.wasAbleTo(Open.url(url));
	}

	public static Ingresar alPortalDeVentasCon(WebDriver chrome, String url) {
		return Tasks.instrumented(Ingresar.class, chrome, url);
	}

}
