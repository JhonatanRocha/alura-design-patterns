package br.com.designPatterns.model;

public class OrcamentoReprovado implements StatusOrcamento{

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Somente orçamento em aprovação ou aprovados " + 
									"recebem desconto extra");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos reprovados não podem ser aprovados.");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamento já está reprovado.");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.status = new OrcamentoFinalizado();
	}
}
