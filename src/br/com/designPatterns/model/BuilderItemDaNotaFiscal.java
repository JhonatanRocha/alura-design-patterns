package br.com.designPatterns.model;

public class BuilderItemDaNotaFiscal {

	private String nome;
	private double valor;
	
	public String getNome() {
		return nome;
	}
	
	public BuilderItemDaNotaFiscal setNome(String nome) {
		this.nome = nome;
		return this;
	}
	
	public BuilderItemDaNotaFiscal setValor(double valor) {
		this.valor = valor;
		return this;
	}
	
	public ItemDaNotaFiscal build(){
		return new ItemDaNotaFiscal(nome, valor);
	}
}
