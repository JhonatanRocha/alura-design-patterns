package br.com.designPatterns.model;

public class DescontoPorCincoItens implements Desconto{

	private Desconto proximoDesconto;
	
	public DescontoPorCincoItens(Desconto proximoDesconto){
		this.proximoDesconto = proximoDesconto;
	}
	
	public double desconta(Orcamento orcamento){
		if(orcamento.getItens().size() > 5){
			return orcamento.getValor() * 0.10;
		}else {
			return proximoDesconto.desconta(orcamento);
		}
	}

	@Override
	public void setProximoDesconto(Desconto proximoDesconto) {
		this.proximoDesconto = proximoDesconto;
	}
}
