package br.com.designPatterns.model;

public class ICPP extends TemplateImpostoCondicional{
	
	public ICPP() {}

    public ICPP(Imposto composicaoImposto) {
        super(composicaoImposto);
    }
	
	@Override
	protected double minimaTributacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.05 + calculoDeImpostoComposto(orcamento);
	}

	@Override
	protected double maximaTributacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.07 + calculoDeImpostoComposto(orcamento);
	}

	@Override
	protected boolean usarMaximaTributacao(Orcamento orcamento) {
		return orcamento.getValor() > 500;
	}
}
