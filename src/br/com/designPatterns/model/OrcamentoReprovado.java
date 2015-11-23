package br.com.designPatterns.model;

public class OrcamentoReprovado implements StatusOrcamento{

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Somente or�amento em aprova��o ou aprovados " + 
									"recebem desconto extra");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Or�amentos reprovados n�o podem ser aprovados.");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Or�amento j� est� reprovado.");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.status = new OrcamentoFinalizado();
	}
}
