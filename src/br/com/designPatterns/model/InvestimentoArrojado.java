package br.com.designPatterns.model;

import java.util.Random;

public class InvestimentoArrojado implements Investimento{

	private Random random;
	
	public InvestimentoArrojado() {
        this.random = new Random();
      }
	
	@Override
	public double investir(ContaBancaria contaBancaria) {
		int chute = random.nextInt(10);
        if(chute >= 0 && chute <= 1){
        	return contaBancaria.getSaldo() * 0.5;
        }
        else if (chute >= 2 && chute <= 4){
        	return contaBancaria.getSaldo() * 0.3;
        }
        else {
        	return contaBancaria.getSaldo() * 0.006;
        }
	}

}
