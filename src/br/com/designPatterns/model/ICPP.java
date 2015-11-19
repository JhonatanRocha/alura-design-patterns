package br.com.designPatterns.model;

public class ICPP extends TemplateImpostoCondicional{

	@Override
	protected double minimaTributacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
	}

	@Override
	protected double maximaTributacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}

	@Override
	protected boolean usarMaximaTributacao(Orcamento orcamento) {
		return orcamento.getValor() > 500;
	}
}
