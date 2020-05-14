package br.com.diciplinas;

import br.com.alunos.Aluno;
import br.com.professor.Professor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Disciplina {

    private static final byte LIMITE = 10;

    @Id
    private Long id;

    private String nome;
    private String descrição;

    @ManyToMany
    @JoinTable(name = "disciplina_aluno", joinColumns=
            {@JoinColumn(name = "idDisciplina")}, inverseJoinColumns=
            {@JoinColumn(name = "idAluno")})
    private List<Aluno> alunos = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "idProfessor")
    private Professor professor;

    public Disciplina(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
    }

    public void matricular(Aluno aluno) throws LimiteAlunosAlcancadoException {
        if (this.alunos.size() < LIMITE) {
            this.alunos.add(aluno);
        } else {
            throw new LimiteAlunosAlcancadoException("Limite de alunos alcançado , o limite é de " + LIMITE);
        }
    }

    public void mostrarAlunos() {
        this.alunos.stream().forEach(aluno -> System.out.println(aluno.getNome()));
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }
}
