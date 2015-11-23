package br.com.designPatterns.model;

import javax.management.RuntimeErrorException;

public class OrcamentoEmAprovacao implements StatusOrcamento{

	
	private boolean descontoAplicado = false;
	
	public void aplicaDescontoExtra(Orcamento orcamento){
		if(!descontoAplicado){
			orcamento.valor -= orcamento.valor * 0.05;
	       	descontoAplicado = true;
	       
		} else
	      throw new RuntimeException("Desconto j� aplicado!");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		orcamento.status = new OrcamentoAprovado();
	}

	@Override
	public void reprova(Orcamento orcamento) {
		orcamento.status = new OrcamentoReprovado();
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Or�amentos em aprova��o n�o podem ir direto para finalizado.");
	}
}
