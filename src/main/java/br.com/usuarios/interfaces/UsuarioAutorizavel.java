package br.com.usuarios.interfaces;

public interface UsuarioAutorizavel {

    default boolean temAutorizacao(){
        return true;
    }
}
