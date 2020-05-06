package br.com;

import br.com.tarefas.ListaTarefas;

public class Principal {

    public static void main(String[] args) {

        ListaTarefas tarefas = new ListaTarefas();

        tarefas.adicionar("Regar plantas");
        tarefas.adicionar("Tirar lixo");
        tarefas.adicionar("Estudar");

        System.out.println("Minhas terefas");
        System.out.println("----------------");
        tarefas.exibirTarefas();





    }

}
