package br.com.designPatterns.test;

import br.com.designPatterns.model.Orcamento;

public class TestDescontoExtra {
	public static void main(String[] args) {
		Orcamento orcamentoReforma = new Orcamento(500.0);
		
		orcamentoReforma.aplicaDescontoExtra();
		
		System.out.println("Valor do Orçamento com desconto Extra " + 
							orcamentoReforma.getValor());
	
		/*orcamentoReforma.aprova();
		orcamentoReforma.aplicaDescontoExtra();
		
		System.out.println("Valor do Orçamento com desconto Extra " + 
				orcamentoReforma.getValor());
		
		orcamentoReforma.finaliza();
		orcamentoReforma.aplicaDescontoExtra();*/
		
		orcamentoReforma.aprova();
		orcamentoReforma.aplicaDescontoExtra();
		System.out.println("Valor do Orçamento com desconto Extra " + 
				orcamentoReforma.getValor());
		orcamentoReforma.aplicaDescontoExtra();
		orcamentoReforma.aplicaDescontoExtra();
		
	}
}
