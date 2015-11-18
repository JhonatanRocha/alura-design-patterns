package br.com.designPatterns.model;

public class ContaBancaria {
	
	private double saldo;
	
	public ContaBancaria(double saldo){
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void deposita(double valorDoDeposito) {
        this.saldo += valorDoDeposito;
    }
}
