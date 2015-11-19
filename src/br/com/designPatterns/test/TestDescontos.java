package br.com.designPatterns.test;

import br.com.designPatterns.model.Item;
import br.com.designPatterns.model.Orcamento;
import br.com.designPatterns.system.CalculadorDeDesconto;

public class TestDescontos {
	public static void main(String[] args) {
		CalculadorDeDesconto calculadorDeDesconto = new CalculadorDeDesconto();
		
		Orcamento orcamento = new Orcamento(40.0);
		orcamento.adicionaItem(new Item("Lapis", 15.0));
		orcamento.adicionaItem(new Item("Caneta", 15.0));
		orcamento.adicionaItem(new Item("Borracha", 10.0));
		
		double desconto = calculadorDeDesconto.calcula(orcamento);
		System.out.println("Valor do orçamento: " + orcamento.getValor() + 
							"\nDesconto: " + desconto +
							"\nValor do orçamento com Desconto: " + (orcamento.getValor() - desconto));
	}
}
