
public class CalculadorDeImposto {
	
	public void realizaCalculo(Orcamento orcamento, Imposto imposto){
		double valorTributado = imposto.calcula(orcamento);
		System.out.println(valorTributado);
	}
}
