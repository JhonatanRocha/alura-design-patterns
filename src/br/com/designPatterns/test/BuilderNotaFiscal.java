package br.com.designPatterns.test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.designPatterns.model.ItemDaNotaFiscal;
import br.com.designPatterns.model.NotaFiscal;

public class BuilderNotaFiscal {

	private String razaoSocial;
	private String cnpj;
	private List<ItemDaNotaFiscal> itens = new ArrayList<ItemDaNotaFiscal>();
	private double valorBruto;
	private double impostos;
	private String observacoes;
	private Calendar data;
	
	public BuilderNotaFiscal() {
        this.data = Calendar.getInstance();
    }
	
	public BuilderNotaFiscal setEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}

	public BuilderNotaFiscal setCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}
	
	public BuilderNotaFiscal setItem(ItemDaNotaFiscal itemDaNotaFiscal){
		itens.add(itemDaNotaFiscal);
		this.valorBruto += itemDaNotaFiscal.getValor();
		this.impostos += itemDaNotaFiscal.getValor() * 0.05;
		return this;
	}
	
	public BuilderNotaFiscal setObservacoes(String observacoes){
		this.observacoes = observacoes;
		return this;
	}
	
	public BuilderNotaFiscal setData(Calendar dataNotaFiscal){
		this.data = dataNotaFiscal;
		return this;
	}
	
	public NotaFiscal build(){
		return new NotaFiscal(razaoSocial, cnpj, data, valorBruto, impostos, itens, observacoes);
	}
}
