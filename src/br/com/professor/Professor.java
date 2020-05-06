package br.com.professor;


import br.com.usuarios.UsuarioAutorizavel;
import sun.security.validator.ValidatorException;

import java.util.Arrays;
import java.util.List;

public class Professor extends UsuarioAutorizavel {

    public Professor(String login, String cpf, String nome) throws ValidatorException {
        super(login, cpf, nome);
    }

    @Override
    protected List<String> getAutorizacoes() {
        return Arrays.asList("PROF");
    }

    @Override
    protected boolean verificarAutorizacaoLogin() {
        return true;
    }

}

