package ar.edu.java.taller.dao;

import ar.edu.java.taller.modelo.Usuario;

// Interface que define los metodos del DAO de Usuarios.
public interface UsuarioDao {
	
	Usuario consultarUsuario (Usuario usuario);
}
