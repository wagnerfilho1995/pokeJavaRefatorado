package me.pavva.PokeJava;

public class DanoEletrico extends Dano implements CalculaVantagem{

	public double calculaVantagem(Pokemon Pokemon) {
		if(Pokemon.getType() == "water"){
			return 2.0; 
		}
		return 0.5;
	}
}
