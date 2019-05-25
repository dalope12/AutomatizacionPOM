package com.automationpractice.exceptions;

public class OrdenNoConfirmada extends AssertionError{

	public static final String LA_ORDEN_NO_ESTA_CONFIRMADA = "La orden no está confirmada porque no aparece el mensaje correcto.";
	
	public OrdenNoConfirmada(String mensaje, Throwable error) {
		super(mensaje, error);
	}
}
