package me.pavva.PokeJava;

public class BancoUsuarios {
	    
 	private int usuariosOnline;
	private int totalUsuarios;
	
    public BancoUsuarios() {
        usuariosOnline = (int) (Math.random() * 10);
        totalUsuarios = (int) (Math.random() * 10);
    }
	 
    public String getUsuariosOnline() {
        return new String("Usuários conectados: " + usuariosOnline);
    }
    
    public String getTotalUsuarios() {
        return new String("Total Usuários: " + totalUsuarios);
    }
    
}
