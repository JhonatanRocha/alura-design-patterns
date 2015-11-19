package br.com.designPatterns.model;

public class IKCV extends TemplateImpostoCondicional{

	public boolean haItemMaiorQue100Reais(Orcamento orcamento) {
		for(Item item : orcamento.getItens()){
			if(item.getValor() > 100)
				return true;
		}
		return false;
	}

	@Override
	protected double minimaTributacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

	@Override
	protected double maximaTributacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.10;
	}

	@Override
	protected boolean usarMaximaTributacao(Orcamento orcamento) {
		return orcamento.getValor() > 500 && haItemMaiorQue100Reais(orcamento);
	}
}
