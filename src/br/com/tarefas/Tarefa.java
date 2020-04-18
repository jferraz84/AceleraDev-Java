package br.com.tarefas;

public class Tarefa {

    String descricao ;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public void exibirTarefas(){
        System.out.println(descricao);
    }

    public int obterTamanhoTarefas(){
        return descricao.length();
    }

}
