package br.com.designPatterns.model;

import java.util.Random;

public class InvestimentoModerado implements Investimento{

	private Random random;
	
	public InvestimentoModerado() {
        this.random = new Random();
      }
	
	@Override
	public double investir(ContaBancaria contaBancaria) {
		if(random.nextInt(2) == 0){
			return contaBancaria.getSaldo() * 0.025;
		}
        else {
        	return contaBancaria.getSaldo() * 0.007;
        }
	}

}
