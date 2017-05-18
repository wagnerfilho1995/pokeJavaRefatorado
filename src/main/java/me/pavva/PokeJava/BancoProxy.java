package me.pavva.PokeJava;

public class BancoProxy extends BancoUsuarios {

	// PROTECTION PROXY
	
	protected String usuario, senha;
	
    public BancoProxy(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }
    
    @Override
    public String getUsuariosOnline() {
        if (temPermissaoDeAcesso()) {
            return super.getUsuariosOnline();
        }
        return null;
    }
 
    @Override
    public String getTotalUsuarios() {
        if (temPermissaoDeAcesso()) {
            return super.getTotalUsuarios();
        }
        return null;
    }
 
    private boolean temPermissaoDeAcesso() {
    
    	usuario =  usuario.toUpperCase();
    	senha = senha.toUpperCase();
     
    	if(usuario.equals("FIRE") && senha.equals("PIKACHU")){
    	  	return true;
        }
    	
        return false;
    }

}
