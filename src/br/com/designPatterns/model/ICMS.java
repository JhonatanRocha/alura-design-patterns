package br.com.designPatterns.model;


public class ICMS extends Imposto{

	public ICMS(Imposto composicaoImposto) {
		super(composicaoImposto);
	}
	
	public ICMS() {
		//super();
	}

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.1 + calculoDeImpostoComposto(orcamento);
		//return orcamento.getValor() * (0.05 + 50) + calcula(orcamento);
	}
}
