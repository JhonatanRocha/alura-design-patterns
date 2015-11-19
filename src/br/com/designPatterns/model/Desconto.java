package br.com.designPatterns.model;

public interface Desconto {
	double desconta(Orcamento orcamento);
	void setProximoDesconto(Desconto proximoDesconto);
}
