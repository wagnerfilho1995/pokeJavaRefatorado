package me.pavva.PokeJava;

public class ataqueUm implements DanoCommand{

	public double calculaDanoBatalha(Pokemon meuPokemon, Pokemon oponentePokemon, CalculaVantagem bonus) {
		return (20.0 * bonus.calculaVantagem(oponentePokemon));
	}
	
}
