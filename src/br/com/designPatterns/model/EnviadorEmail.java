package br.com.designPatterns.model;

public class EnviadorEmail implements ActionAfterNotaFiscal{

	@Override
	public void execute(NotaFiscal notaFiscal) {
		System.out.println("Email enviado.");
	}
}
