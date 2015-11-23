package br.com.designPatterns.dao;

import br.com.designPatterns.model.ActionAfterNotaFiscal;
import br.com.designPatterns.model.NotaFiscal;

public class NotaFiscalDAO implements ActionAfterNotaFiscal{
	
	public void execute(NotaFiscal notaFiscal) {
		System.out.println("Salvo no banco de dados.");
	}
}
