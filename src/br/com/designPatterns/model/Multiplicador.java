package br.com.designPatterns.model;

public class Multiplicador implements ActionAfterNotaFiscal {

	private double fatorMultiplicador;

	 public Multiplicador(double fatorMultiplicador) {
	    this.fatorMultiplicador = fatorMultiplicador;
	  }
	
	@Override
	public void execute(NotaFiscal notaFiscal) {
		System.out.println("Valor da nota multiplicado por " + fatorMultiplicador + ": " + 
							notaFiscal.getValorBruto() * fatorMultiplicador);
	}
	
}
