package me.pavva.PokeJava;

public class ataqueQuatro implements DanoCommand{

	public double calculaDanoBatalha(Pokemon meuPokemon, Pokemon oponentePokemon, CalculaVantagem bonus) {
		return (30.0 * bonus.calculaVantagem(oponentePokemon));
	}
	
}

