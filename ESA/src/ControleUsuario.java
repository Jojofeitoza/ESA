import java.util.ArrayList;


public class ControleUsuario {

	private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

	public void adicionarUsuario(Usuario usu) {
		if (!this.existeEmailJaCadastrado(usu)){
			this.usuarios.add(usu);
		}
	}

	public boolean existeUsuario(Usuario usu) {
		if ( this.usuarios.contains(usu)){
			return true;
		}
		return false;
	}
	
	private boolean existeEmailJaCadastrado(Usuario usu){
		for(Usuario usuAux : this.usuarios){
			if ( usuAux.getEmail().equalsIgnoreCase(usu.getEmail())){
				return true;
			}
		}
		return false;
	}
	

	public void removerUsuario(Usuario usu) {
		
		if ( this.existeUsuario(usu) ){
			this.usuarios.remove(usu);
		}
		
	}

	public Usuario getUsuario(String email, String senha) {
		for (Usuario usu : this.usuarios){
			if ( usu.getEmail().equalsIgnoreCase(email) && usu.getSenha().equalsIgnoreCase(senha)){
				return usu;
			}
		}
		return null;
	}
	
	
}
