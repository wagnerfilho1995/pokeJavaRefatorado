package me.pavva.PokeJava;

public class DanoRocha extends Dano implements CalculaVantagem{

	public double calculaVantagem(Pokemon Pokemon) {
		if(Pokemon.getType() == "flying"){
			return 2.0; 
		}
		return 0.5;
	}

}
