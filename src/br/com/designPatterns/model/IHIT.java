package br.com.designPatterns.model;

import java.util.ArrayList;
import java.util.List;

public class IHIT extends TemplateImpostoCondicional{

	public boolean haItemsComMesmoNome(Orcamento orcamento) {
		List<String> contemNoOrcamento = new ArrayList<String>();

        for(Item item : orcamento.getItens()) {
          if(contemNoOrcamento.contains(item.getNome())) 
        	  return true;
          else 
        	  contemNoOrcamento.add(item.getNome());
        }
        return false;
	}

	@Override
	protected double minimaTributacao(Orcamento orcamento) {
		 return orcamento.getValor() * (0.01 * orcamento.getItens().size());
	}

	@Override
	protected double maximaTributacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.13 + 100;
	}

	@Override
	protected boolean usarMaximaTributacao(Orcamento orcamento) {
		List<String> noOrcamento = new ArrayList<String>();

        for(Item item : orcamento.getItens()) {
          if(noOrcamento.contains(item.getNome()))
        	  return true;
          else 
        	  noOrcamento.add(item.getNome());
        }
        return false;
	}
}
