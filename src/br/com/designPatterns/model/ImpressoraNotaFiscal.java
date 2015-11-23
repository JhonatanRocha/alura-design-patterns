package br.com.designPatterns.model;

public class ImpressoraNotaFiscal implements ActionAfterNotaFiscal{
	public void execute(NotaFiscal notaFiscal) {
		System.out.println("Nota Impressa.");
	}
}
