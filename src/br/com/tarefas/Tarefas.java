package br.com.tarefas;

public class Tarefas {

    String descricao ;

    public Tarefas(String descricao) {
        this.descricao = descricao;
    }

    public void exibirTarefas(){
        System.out.println(descricao);
    }

    public int obterTamanhoTarefas(){
        return descricao.length();
    }

}
