package br.com.professor;


import br.com.alunos.ValidationException;
import br.com.diciplinas.Disciplina;
import br.com.usuarios.UsuarioAutorizavel;
import sun.security.validator.ValidatorException;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Arrays;
import java.util.List;

@Entity
public class Professor extends UsuarioAutorizavel {

    @OneToMany(mappedBy = "professor")
    private List<Disciplina> disciplinas;

    public Professor(String login, String cpf, String nome) throws ValidationException {
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

