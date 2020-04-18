package br.com;

import br.com.tarefas.Tarefas;

public class Principal {

    public static void main(String[] args) {

        System.out.println("Minhas terefas");
        System.out.println("----------------");

        Tarefas tarefa1 = new Tarefas("Regar plantas");
        tarefa1.exibirTarefas();


    }

}
