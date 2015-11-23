package br.com.designPatterns.model;

public class OrcamentoFinalizado implements StatusOrcamento{

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Somente or�amento em aprova��o ou aprovados " + 
				"recebem desconto extra");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Or�amento j� finalizado.");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Or�amento j� finalizado.");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Or�amento j� finalizado.");
	}
}
