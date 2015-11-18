package br.com.designPatterns.test;
import br.com.designPatterns.model.ICCC;
import br.com.designPatterns.model.ICMS;
import br.com.designPatterns.model.ISS;
import br.com.designPatterns.model.Imposto;
import br.com.designPatterns.model.Orcamento;
import br.com.designPatterns.system.CalculadorDeImposto;


public class TestImpostos {
	
	public static void main(String[] args) {
		Imposto iss = new ISS();
		Imposto icms = new ICMS();
		Imposto iccc = new ICCC();
		
		Orcamento orcamento = new Orcamento(500.0);
		
		CalculadorDeImposto calculador = new CalculadorDeImposto();
		
		calculador.realizaCalculo(orcamento, iss);
		calculador.realizaCalculo(orcamento, icms);
		calculador.realizaCalculo(orcamento, iccc);
	}
}
