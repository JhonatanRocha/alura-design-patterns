package br.com.designPatterns.model;


public abstract class Imposto {
	
	private Imposto composicaoImposto;
	
	public Imposto(Imposto composicaoImposto){
		this.composicaoImposto = composicaoImposto;
	}
	
	public Imposto(){
		this.composicaoImposto = null;
	}
	
	public abstract double calcula(Orcamento orcamento);


	protected double calculoDeImpostoComposto(Orcamento orcamento) {
		if(composicaoImposto == null)
			return 0;
		else
			return composicaoImposto.calcula(orcamento);
	}
}
