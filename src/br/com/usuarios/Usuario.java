package br.com.usuarios;

public class Usuario {

    private String login;
    private String cpf;
    private String nome;

    public Usuario(String login, String cpf, String nome) {
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
