package br.com.designPatterns.model;

public abstract class TemplateImpostoCondicional extends Imposto {

	 public TemplateImpostoCondicional(Imposto composicaoImposto) {
         super(composicaoImposto);
     }

     public TemplateImpostoCondicional() {
     }
	
	@Override
	public final double calcula(Orcamento orcamento) {
		if(usarMaximaTributacao(orcamento))
			return maximaTributacao(orcamento) + calculoDeImpostoComposto(orcamento);
		else
			return minimaTributacao(orcamento) + calculoDeImpostoComposto(orcamento);
	}

	protected abstract double minimaTributacao(Orcamento orcamento);

	protected abstract double maximaTributacao(Orcamento orcamento);

	protected abstract boolean usarMaximaTributacao(Orcamento orcamento);

}
