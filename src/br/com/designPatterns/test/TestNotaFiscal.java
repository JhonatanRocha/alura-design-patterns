package br.com.designPatterns.test;

import br.com.designPatterns.model.BuilderItemDaNotaFiscal;
import br.com.designPatterns.model.ItemDaNotaFiscal;
import br.com.designPatterns.model.NotaFiscal;

public class TestNotaFiscal {
	public static void main(String[] args) {
		
		BuilderItemDaNotaFiscal builderItem = new BuilderItemDaNotaFiscal();
		
		//Interfaces fluentes com Method chain.
		builderItem.setNome("item 1")
		.setValor(200);
		
		
		BuilderNotaFiscal builderNotaFiscal = new BuilderNotaFiscal();
		
		//Interfaces fluentes com Method chain.
		builderNotaFiscal.setEmpresa("JCR Tech")
		.setCnpj("12.345.678/001-34")
		.setItem(builderItem.build())
		.setItem(new ItemDaNotaFiscal("item 2", 300.0))
		.setItem(new ItemDaNotaFiscal("item 3", 400.0))
		.setEmpresa("nenhuma observação.");
		//.setData();
		
		NotaFiscal notaFiscal = builderNotaFiscal.build();
	
		System.out.println(notaFiscal.getValorBruto());
	}
}
