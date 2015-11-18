package br.com.designPatterns.system;
import br.com.designPatterns.model.Imposto;
import br.com.designPatterns.model.Orcamento;


public class CalculadorDeImposto {
	
	public void realizaCalculo(Orcamento orcamento, Imposto imposto){
		double valorTributado = imposto.calcula(orcamento);
		System.out.println(valorTributado);
	}
}
