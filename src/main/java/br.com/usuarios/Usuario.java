package br.com.usuarios;

import br.com.alunos.ValidationException;
import br.com.relatorios.Coluna;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario {

    @Id
    private Long id;

    @Column(nullable = false)
    private String login;

    @Column(nullable = false, length = 14, unique = true)
    private String cpf;

    @Column(nullable = false)
    private String nome;

    public Usuario(String login, String cpf, String nome) throws ValidationException {
        this.login = login;
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        if (validationLogin(login)) {
            this.login = login;
            System.out.println("Login Válido");
        } else {
            System.out.println("Login Inválido !");
        }
    }

    @Coluna(posicao = 2, titulo = "CPF")
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (validaCpf(cpf)){
            this.cpf = cpf;
        } else {
            System.out.println("Cpf não é Válido");
        }
    }

    @Coluna(posicao = 1, titulo = "NOME")
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private boolean validationLogin(String login){
        return login != null && !login.isEmpty()  && login.length() > 3 && login.length() < 20;
    }

    private boolean validaCpf(String cpf){
        return cpf != null && !cpf.isEmpty() && ( cpf.length() == 11 || cpf.length() == 14);
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
