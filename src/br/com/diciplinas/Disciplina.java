package br.com.diciplinas;

import br.com.alunos.Aluno;
import br.com.professor.Professor;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {

    private static final byte LIMITE = 10;

    private String nome;
    private List<Aluno> alunos = new ArrayList<>();
    private Professor professor;

    public Disciplina(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
    }

    public void matricular(Aluno aluno) throws LimiteAlunosAlcancadoException {
        if (this.alunos.size() < LIMITE){
            this.alunos.add(aluno);
        } else {
            throw new LimiteAlunosAlcancadoException("Limite de alunos alcançado , o limite é de " + LIMITE);
        }
    }

    public void mostrarAlunos(){
        this.alunos.stream().forEach(aluno -> System.out.println(aluno.getNome()));
    }
}
