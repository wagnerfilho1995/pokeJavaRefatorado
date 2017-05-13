package me.pavva.PokeJava;

public class ataqueTres implements DanoCommand{

	public double calculaDanoBatalha(Pokemon meuPokemon, Pokemon oponentePokemon, CalculaVantagem bonus) {
		return (25.0 * bonus.calculaVantagem(oponentePokemon));
	}
	
}
