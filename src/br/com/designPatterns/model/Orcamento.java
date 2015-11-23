package br.com.designPatterns.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {
	
	protected double valor;
	private final List<Item> itens;
	protected StatusOrcamento status;
	
	
	public Orcamento(double valor){
		this.valor = valor;
		itens = new ArrayList<Item>();
		status = new OrcamentoEmAprovacao();
	}

	public double getValor() {
		return valor;
	}
	
	public void adicionaItem(Item item){
		itens.add(item);
	}

	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}

	public void aplicaDescontoExtra(){
		status.aplicaDescontoExtra(this);
	}
	
	public void aprova(){
		status.aprova(this);
	}
	
	public void reprova(){
		status.reprova(this);
	}
	
	public void finaliza(){
		status.finaliza(this);
	}
}
