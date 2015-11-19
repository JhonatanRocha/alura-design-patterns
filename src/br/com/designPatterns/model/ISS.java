package br.com.designPatterns.model;


public class ISS extends Imposto{
	
	public ISS(Imposto composicaoImposto){
		super(composicaoImposto);
	}
	
	public ISS(){
		//super();
	}
	
	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.06 + calculoDeImpostoComposto(orcamento);
	}
}
