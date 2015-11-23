package br.com.designPatterns.model;

public class EnviadorSMS implements ActionAfterNotaFiscal{
	public void execute(NotaFiscal notaFiscal) {
		System.out.println("SMS enviado.");
	}
}
