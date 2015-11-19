package br.com.designPatterns.model;


public class ICCC extends Imposto{

	public ICCC(Imposto composicaoImposto) {
		super(composicaoImposto);
	}

	public ICCC() {
		super();
	}
	
	@Override
	public double calcula(Orcamento orcamento) {
		if(orcamento.getValor() < 1000){
			return orcamento.getValor() * 0.05 + calculoDeImpostoComposto(orcamento);
		}else if (orcamento.getValor() > 1000 && orcamento.getValor() < 3000){
			return orcamento.getValor() * 0.07 + calculoDeImpostoComposto(orcamento);
		}else {
			return orcamento.getValor();
		}
	}

}
