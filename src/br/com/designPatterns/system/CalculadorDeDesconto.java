package br.com.designPatterns.system;

import br.com.designPatterns.model.Desconto;
import br.com.designPatterns.model.DescontoAcimaDeQuinhentosReais;
import br.com.designPatterns.model.DescontoPorCincoItens;
import br.com.designPatterns.model.DescontoPorCombo;
import br.com.designPatterns.model.Orcamento;
import br.com.designPatterns.model.SemDesconto;

public class CalculadorDeDesconto {
	public double calcula(Orcamento orcamento){
		
		/*Setando a Chain of Chain of Responsibility
		 * através dos setters das Classes
		 * 
		 * Desconto descontoPorCincoItens = new DescontoPorCincoItens();
		Desconto descontoAcimaDeQuinhentosReais = new DescontoAcimaDeQuinhentosReais();
		Desconto descontoPorCombo = new DescontoPorCombo();
		Desconto semDesconto = new SemDesconto();
		
		descontoPorCincoItens.setProximoDesconto(descontoAcimaDeQuinhentosReais);
		descontoAcimaDeQuinhentosReais.setProximoDesconto(descontoPorCombo);
		descontoPorCombo.setProximoDesconto(semDesconto);*/
		
		/*Implementando Chain of Chain of Responsibility
		 *Através dos métodos construtores das classes
		 *note que investemos a ordem para podermos passarmos as classes
		 *criadas corretamente
		 */
		Desconto semDesconto = new SemDesconto();
		Desconto descontoPorCombo = new DescontoPorCombo(semDesconto);
		Desconto descontoAcimaDeQuinhentosReais = new DescontoAcimaDeQuinhentosReais(descontoPorCombo);
		Desconto descontoPorCincoItens = new DescontoPorCincoItens(descontoAcimaDeQuinhentosReais);
		
		return descontoPorCincoItens.desconta(orcamento);
	}
}
