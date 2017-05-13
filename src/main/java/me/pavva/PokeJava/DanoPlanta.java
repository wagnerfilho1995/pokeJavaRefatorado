package me.pavva.PokeJava;

public  class DanoPlanta extends Dano implements CalculaVantagem{

	public double calculaVantagem(Pokemon Pokemon) {
		if(Pokemon.getType() == "rock"){
			return 2.0; 
		}
		return 0.5;
	}

}
