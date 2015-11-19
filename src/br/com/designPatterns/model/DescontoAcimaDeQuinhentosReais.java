package br.com.designPatterns.model;

public class DescontoAcimaDeQuinhentosReais implements Desconto{

	private Desconto proximoDesconto;
	
	public DescontoAcimaDeQuinhentosReais(Desconto proximoDesconto){
		this.proximoDesconto = proximoDesconto;
	}
	
	public double desconta(Orcamento orcamento){
		if(orcamento.getValor() > 500){
			return orcamento.getValor() * 0.07;
		}
		return proximoDesconto.desconta(orcamento);
	}

	@Override
	public void setProximoDesconto(Desconto proximoDesconto) {
		this.proximoDesconto = proximoDesconto;
	}
}
