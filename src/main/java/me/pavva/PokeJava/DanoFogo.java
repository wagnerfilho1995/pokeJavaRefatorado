package me.pavva.PokeJava;

public class DanoFogo extends Dano implements CalculaVantagem{

	public double calculaVantagem(Pokemon Pokemon) {
		if(Pokemon.getType() == "grass"){
			return 2.0; 
		}
		return 0.5;
	}


}
