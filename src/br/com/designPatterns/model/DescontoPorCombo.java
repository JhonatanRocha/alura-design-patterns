package br.com.designPatterns.model;

public class DescontoPorCombo implements Desconto{

	private Desconto proximoDesconto;
	
	public DescontoPorCombo(Desconto proximoDesconto){
		this.proximoDesconto = proximoDesconto;
	}
	
	public double desconta(Orcamento orcamento){
		if(contemItem(orcamento,"Caneta") && contemItem(orcamento,"Lapis")){
			return orcamento.getValor() * 0.05;
		}else {
			return proximoDesconto.desconta(orcamento);
		}
	}

	@Override
	public void setProximoDesconto(Desconto proximoDesconto) {
		this.proximoDesconto = proximoDesconto;
	}
	
	private boolean contemItem(Orcamento orcamento, String itemNome){
		
		for(Item item : orcamento.getItens()){
			if(item.getNome().equals(itemNome)){
				return true;
			}
		}
		return false;	
	}
}
