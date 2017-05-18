package me.pavva.PokeJava;

public class DanoLutador extends Dano implements CalculaVantagem{

	public double calculaVantagem(Pokemon Pokemon) {
		if(Pokemon.getType() == "normal"){
			return 2.0; 
		}
		return 0.5;
	}

}
