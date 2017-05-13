package me.pavva.PokeJava;

public class ataqueDois implements DanoCommand{

	public double calculaDanoBatalha(Pokemon meuPokemon, Pokemon oponentePokemon, CalculaVantagem bonus) {
		return (18.0 * bonus.calculaVantagem(oponentePokemon));
	}
}