package br.com.tarefas;

import java.util.ArrayList;

public class ListaTarefas {

    ArrayList<Tarefa> tarefas = new ArrayList<>();

    public void adicionar (Tarefa tarefa){
        if (tarefa != null && tarefa.obterTamanhoTarefas() <= 20) {
            this.tarefas.add(tarefa);
        } else {
            System.out.println("A tarefa é inválida !!");
        }
    }

    public void adicionar(String  descricao){
        Tarefa tarefa = new Tarefa(descricao);
        adicionar(tarefa);
    }

    public void remover(int posicao){
        if (posicao < this.tarefas.size()) {
            this.tarefas.remove(posicao);
        }  else {
            System.out.println("===================================");
            System.out.println("Não existe tarefa para ser removida");
            System.out.println("===================================");
        }
    }

    public void remover(Tarefa tarefa){
        this.tarefas.remove(tarefa);
    }

    public Tarefa buscar(String descricao){
        for (Tarefa tarefa: tarefas){
            if (descricao.equals(tarefa.descricao)){
                return tarefa;
            }
        }
        System.out.println("Tarefa não encontrada");
        return null;
    }

    //Para exibir monte um for para correr a lista e ir adicionando novos itens
    public void exibirTarefas(){
        for (Tarefa tarefa: tarefas) {
            tarefa.exibirTarefas();
        }
    }
}
