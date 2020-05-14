package br.com.diretor;

import br.com.alunos.ValidationException;
import br.com.relatorios.Coluna;
import br.com.usuarios.UsuarioAutorizavel;
import sun.security.validator.ValidatorException;

import java.util.Arrays;
import java.util.List;

public class Diretor extends UsuarioAutorizavel {


    private String dataCargo;

    public Diretor(String login, String cpf, String nome) throws ValidationException {
        super(login, cpf, nome);
    }

    @Override
    protected List<String> getAutorizacoes() {
        return Arrays.asList("ADMIN");
    }

    @Override
    protected boolean verificarAutorizacaoLogin() {
        return true;
    }

    @Coluna(posicao = 3, titulo = "DATACARGO")
    public String getDataCargo() {
        return dataCargo;
    }

    public void setDataCargo(String dataCargo) {
        this.dataCargo = dataCargo;
    }
}
