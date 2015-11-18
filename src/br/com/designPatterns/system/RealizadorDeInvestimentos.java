package br.com.designPatterns.system;

import br.com.designPatterns.model.ContaBancaria;
import br.com.designPatterns.model.Investimento;

public class RealizadorDeInvestimentos {
	
	public void realizaInvestimento(ContaBancaria contaBancaria, Investimento investimento) {
        double resultado = investimento.investir(contaBancaria);

        contaBancaria.deposita( resultado * 0.75 );
        System.out.println ( "Novo saldo: " + contaBancaria.getSaldo());
      }
}
