package br.com.alunos;


import br.com.diciplinas.Disciplina;
import br.com.usuarios.Usuario;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity //quer dizer 'TABELA'
public class Aluno extends Usuario {


    private Integer numeroMatricula;

    @ManyToMany
    @JoinTable(name = "disciplina_aluno", joinColumns=
            {@JoinColumn(name = "idAluno")}, inverseJoinColumns=
            {@JoinColumn(name = "idDisciplina")})
    private List<Disciplina> disciplinas;

    public Aluno(String login, String cpf, String nome) throws ValidationException {
        super(login, cpf, nome);
    }

    public Integer getNumeroMatricula() {

        return numeroMatricula;
    }

    public void setNumeroMatricula(Integer numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }
}
