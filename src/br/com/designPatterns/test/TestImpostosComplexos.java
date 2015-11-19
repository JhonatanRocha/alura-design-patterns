package br.com.designPatterns.test;

import br.com.designPatterns.model.ICMS;
import br.com.designPatterns.model.ICPP;
import br.com.designPatterns.model.ISS;
import br.com.designPatterns.model.Imposto;
import br.com.designPatterns.model.ImpostoMuitoAlto;
import br.com.designPatterns.model.Orcamento;

public class TestImpostosComplexos {
	public static void main(String[] args) {
		//Imposto issComposto = new ISS(new ICMS());
		//Imposto issComposto = new ISS(new ICPP());
		Imposto impostosMuitoAlto = new ImpostoMuitoAlto(new ICMS());
		
		Orcamento orcamento = new Orcamento(500);
		
		//double valorTributado = issComposto.calcula(orcamento);
		
		System.out.println(impostosMuitoAlto.calcula(orcamento));
	}
}
