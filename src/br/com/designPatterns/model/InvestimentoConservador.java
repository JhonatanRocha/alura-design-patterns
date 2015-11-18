package br.com.designPatterns.model;

public class InvestimentoConservador implements Investimento{

	@Override
	public double investir(ContaBancaria contaBancaria) {
		return contaBancaria.getSaldo() * 0.008;
	}

}
