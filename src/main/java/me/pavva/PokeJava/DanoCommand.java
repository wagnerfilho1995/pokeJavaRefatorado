package me.pavva.PokeJava;

public interface DanoCommand {
	
	double calculaDanoBatalha(Pokemon meuPokemon, Pokemon oponentePokemon, CalculaVantagem bonus); // PADRAO STRATEGY
	
}
