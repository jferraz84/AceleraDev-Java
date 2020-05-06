package br.com.coordenador;

import br.com.usuarios.UsuarioAutorizavel;
import sun.security.validator.ValidatorException;

import java.util.Arrays;
import java.util.List;

public class Coordenador extends UsuarioAutorizavel {
    private long matricula;

    public Coordenador(String login, String cpf, String nome) throws ValidatorException {
        super(login, cpf, nome);
    }

    @Override
    protected List<String> getAutorizacoes() {
        return Arrays.asList("COORD");
    }

    @Override
    protected boolean verificarAutorizacaoLogin() {
        return false;
    }

    public long getMatricula() {

        return matricula;
    }

    public void setMatricula(long matricula) {

        this.matricula = matricula;
    }


}
