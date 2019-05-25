package com.automationpractice.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/comprar_vestido.feature",
		glue="com.automationpractice.stepdefinitions",
		snippets=SnippetType.CAMELCASE
		)
public class Comprar_vestido_runner {}