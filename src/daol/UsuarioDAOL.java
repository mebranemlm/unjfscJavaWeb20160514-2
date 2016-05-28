package daol;

import java.util.List;

import model.Usuario;

public interface UsuarioDAOL 
{
	//Metodo para validarLogin, con parametro de entrada xxxxx
	public abstract Usuario validateUsua(Usuario obj) throws Exception;
	public abstract Usuario questUsua(Usuario obj) throws Exception;
	public abstract void addUsua(Usuario obj) throws Exception;
	public abstract void editUsua(Usuario obj) throws Exception;
	public abstract List<Usuario> questListUsua(Usuario obj) throws Exception;
	public abstract List<Usuario> listUsua() throws Exception;
	//elmininar
	//registrar
	//...ncosas	
}
