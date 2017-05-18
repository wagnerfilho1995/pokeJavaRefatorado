package me.pavva.PokeJava;

public class DanoPsiquico extends Dano implements CalculaVantagem{

	public double calculaVantagem(Pokemon Pokemon) {
		if(Pokemon.getType() == "fighting"){
			return 2.0; 
		}
		return 0.5;
	}

}