package com.automationpractice.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CapturarComprobante {

	public static void CapturarComprobanteDePago(String texto) {
		File f;
		f = new File("Comprobante de la Transaccion.txt");

		try {
			FileWriter w = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(w);
			PrintWriter wr = new PrintWriter(bw);
			wr.write(texto);

			wr.close();
			bw.close();
		} catch (IOException e) {
		}
		;
	}

}
