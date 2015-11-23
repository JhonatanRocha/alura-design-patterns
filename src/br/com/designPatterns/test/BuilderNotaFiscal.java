package br.com.designPatterns.test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.designPatterns.dao.NotaFiscalDAO;
import br.com.designPatterns.model.ActionAfterNotaFiscal;
import br.com.designPatterns.model.EnviadorEmail;
import br.com.designPatterns.model.EnviadorSMS;
import br.com.designPatterns.model.ImpressoraNotaFiscal;
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
	
	private List<ActionAfterNotaFiscal> allActions;
	
	public BuilderNotaFiscal() {
        this.data = Calendar.getInstance();
    }
	
	public BuilderNotaFiscal(List<ActionAfterNotaFiscal> actions) {
        this.data = Calendar.getInstance();
        this.allActions = actions;
    }
	
	public void addAction(ActionAfterNotaFiscal action){
		this.allActions.add(action);
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
		NotaFiscal notaFiscal = new NotaFiscal(razaoSocial, cnpj, data, valorBruto, impostos, itens, observacoes);
		
		for(ActionAfterNotaFiscal acao : allActions){
			acao.execute(notaFiscal);
		}
	
		return notaFiscal;
	}
}
