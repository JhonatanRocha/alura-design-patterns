package br.com.designPatterns.test;

import java.util.ArrayList;
import java.util.List;

import br.com.designPatterns.dao.NotaFiscalDAO;
import br.com.designPatterns.model.ActionAfterNotaFiscal;
import br.com.designPatterns.model.EnviadorEmail;
import br.com.designPatterns.model.EnviadorSMS;
import br.com.designPatterns.model.ImpressoraNotaFiscal;
import br.com.designPatterns.model.ItemDaNotaFiscal;
import br.com.designPatterns.model.Multiplicador;
import br.com.designPatterns.model.NotaFiscal;

public class TestActions {
	public static void main(String[] args) {
		
		List<ActionAfterNotaFiscal> actions = new ArrayList<ActionAfterNotaFiscal>();
		actions.add(new NotaFiscalDAO());
		actions.add(new EnviadorEmail());
		actions.add(new EnviadorSMS());
		actions.add(new ImpressoraNotaFiscal());
		actions.add(new Multiplicador(2));
		
		BuilderNotaFiscal builderNotaFiscal = new BuilderNotaFiscal(actions);


		NotaFiscal notaFiscal = builderNotaFiscal.setEmpresa("JCR Tech")
				.setCnpj("123").setItem(new ItemDaNotaFiscal("nome", 100.0))
				.setObservacoes("Obs: NAda").build();
		
		System.out.println(notaFiscal.getValorBruto());
	}
}
