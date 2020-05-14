package br.com.coordenador;

import br.com.usuarios.UsuarioAutorizavel;
import br.com.alunos.ValidationException;

import java.util.Arrays;
import java.util.List;

public class Coordenador extends UsuarioAutorizavel {
    private long matricula;

    public Coordenador(String login, String cpf, String nome) throws ValidationException {
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
