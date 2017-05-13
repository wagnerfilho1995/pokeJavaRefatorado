package me.pavva.PokeJava;

public class DanoAgua extends Dano implements CalculaVantagem{

	public double calculaVantagem(Pokemon Pokemon) {
		if(Pokemon.getType() == "fire"){
			System.out.print("\n ahhhhhh \n");
	        
			return 2.0; 
		}
		return 0.5;
	}
}
