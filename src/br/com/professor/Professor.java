package br.com.professor;


import br.com.usuarios.Usuario;
import sun.security.validator.ValidatorException;

public class Professor extends Usuario {

    public Professor(String login, String cpf, String nome) throws ValidatorException {
        super(login, cpf, nome);
    }
}

