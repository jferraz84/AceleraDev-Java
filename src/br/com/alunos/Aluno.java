package br.com.alunos;


import br.com.usuarios.Usuario;
import sun.security.validator.ValidatorException;

public class Aluno extends Usuario {

    private Integer numeroMatricula;

    public Aluno(String login, String cpf, String nome) throws ValidatorException {
        super(login, cpf, nome);
    }

    public Integer getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(Integer numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }
}
