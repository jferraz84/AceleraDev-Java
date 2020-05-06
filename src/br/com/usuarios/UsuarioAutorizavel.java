package br.com.usuarios;

import sun.security.validator.ValidatorException;

import java.util.List;

public abstract class UsuarioAutorizavel extends Usuario {

    public UsuarioAutorizavel(String login, String cpf, String nome) throws ValidatorException {
        super(login, cpf, nome);
    }

    public boolean temAutorizacao(){
        List<String> autorizacoes = getAutorizacoes();
        return autorizacoes.contains("ADMIN") || verificarAutorizacaoLogin();
    }

    protected abstract List<String> getAutorizacoes();
    protected abstract boolean verificarAutorizacaoLogin();

}

