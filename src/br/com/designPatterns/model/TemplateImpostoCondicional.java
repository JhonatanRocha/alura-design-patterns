package br.com.designPatterns.model;

public abstract class TemplateImpostoCondicional implements Imposto {

	@Override
	public final double calcula(Orcamento orcamento) {
		if(usarMaximaTributacao(orcamento))
			return maximaTributacao(orcamento);
		else
			return minimaTributacao(orcamento);
	}

	protected abstract double minimaTributacao(Orcamento orcamento);

	protected abstract double maximaTributacao(Orcamento orcamento);

	protected abstract boolean usarMaximaTributacao(Orcamento orcamento);

}
