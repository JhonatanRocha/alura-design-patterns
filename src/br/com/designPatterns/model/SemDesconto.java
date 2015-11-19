package br.com.designPatterns.model;

public class SemDesconto implements Desconto{

	@Override
	public double desconta(Orcamento orcamento) {
		return 0;
	}

	@Override
	public void setProximoDesconto(Desconto proximoDesconto) {
		//Do nothing, because we dont have next discount to be applied.
	}

}
