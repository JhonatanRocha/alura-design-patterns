package br.com.designPatterns.test;

import br.com.designPatterns.model.ContaBancaria;
import br.com.designPatterns.model.Investimento;
import br.com.designPatterns.model.InvestimentoArrojado;
import br.com.designPatterns.model.InvestimentoConservador;
import br.com.designPatterns.model.InvestimentoModerado;
import br.com.designPatterns.system.RealizadorDeInvestimentos;

public class TestInvestimentos {
	public static void main(String[] args) {
		
		Investimento conservador = new InvestimentoConservador();
		Investimento moderado = new InvestimentoModerado();
		Investimento arrojado = new InvestimentoArrojado();
		
		ContaBancaria contaBancaria = new ContaBancaria(1000);
		ContaBancaria contaBancaria2 = new ContaBancaria(1000);
		ContaBancaria contaBancaria3 = new ContaBancaria(1000);
		
		RealizadorDeInvestimentos realizadorDeInvestimentos = new RealizadorDeInvestimentos();
		realizadorDeInvestimentos.realizaInvestimento(contaBancaria, conservador);
		realizadorDeInvestimentos.realizaInvestimento(contaBancaria2, moderado);
		realizadorDeInvestimentos.realizaInvestimento(contaBancaria3, arrojado);
	}
}
