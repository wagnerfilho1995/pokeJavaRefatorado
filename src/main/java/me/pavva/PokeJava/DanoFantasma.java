package me.pavva.PokeJava;

public class DanoFantasma  extends Dano implements CalculaVantagem{

	public double calculaVantagem(Pokemon Pokemon) {
		if(Pokemon.getType() == "psychic"){
			return 2.0; 
		}
		return 0.5;
	}

}