package br.com;

import br.com.alunos.ValidationException;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.text.html.parser.Entity;

public class Main {
    public static void main(String[] args) throws ValidationException {

        //CÓDIGO DO 1° MÓDULO

        /*tarefas.adicionar("Regar plantas");
        tarefas.adicionar("Tirar lixo");
        tarefas.adicionar("Estudar");

        System.out.println("Minhas terefas");
        System.out.println("----------------");
        tarefas.exibirTarefas();*/


           /*Disciplina disciplina = new Disciplina("Matematica", professor);
           disciplina.matricular(new Aluno("12345", "346.796.528-88", "Aline Santos Ferraz"));
            disciplina.matricular(new Aluno("54321", "346.796.528-80", "Helo Ferraz"));
             disciplina.matricular(new Aluno("13579", "346.796.528-81", "Heloa ferraz"));
           disciplina.mostrarAlunos();*/


        // CODIGO DO 2° MÓDULO
       /* RepositorioUsuario repositorioUsuario = new RepositorioUsuario();

        try {
           Professor professor = new Professor("professor", "050.277.939-01", "Jorge");
           Aluno aluno = new Aluno("12345", "346.796.528-88", "Aline Santos Ferraz");

           repositorioUsuario.add(professor);
            repositorioUsuario.add(aluno);
           repositorioUsuario.findAll().stream().forEach(System.out::println);

        } catch (ValidatorException e) {
            System.out.println(e.getMessage());
        }*/

        // CÓDIGO DO 3° MÓDULO - 1° PARTE

    /*UsuarioAutorizavel usuario = new Diretor(
            "coordenador", "050.277.939-01", "Jorge");

        new LancadorNotas().login(usuario);*/

        // CÓDIGO DO 3° MÓDULO - 2° PARTE

        /*Pessoa pessoa = getPessoa();

        AnalisadorCredito analisador = new AnalisadorCredito();
        boolean resultado = analisador.analisarCredito(pessoa);

        if (resultado) {
            System.out.println("Crédito Aprovado");
        } else {
            System.out.println("Crédito Reprovado");
        }
    }

    public static Pessoa getPessoa() {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Jorge");
        pessoa.setCpf("050.277.939-01");
        pessoa.setQtdChequesDevolvidos(0);
        pessoa.setScoreSPC(500);
        pessoa.setScoreSerasa(500);
        pessoa.setValorDivida(1001);

        return pessoa;
    }*/

        // CÓDIGO DO 3° MÓDULO - 2° PARTE

        /*GeradorRelatorio gerador = new GeradorRelatorio();
        Usuario usuario = new Aluno("login", "050.277.939-01", "Jorge");
        Diretor usuario2 = new Diretor("login", "050.277.939-01", "José");
        usuario2.setDataCargo("03/05/2018");
        Usuario usuario3 = new Aluno("login", "050.277.939-01", "João");


        List<Object> usuarios = new ArrayList<>();
        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);

        gerador.gerarRelatorio(usuarios, 3);*/


        // CÓDIGO DO 4° MÓDULO - 1° PARTE

        EntityManagerFactory factory = Persistence.
                createEntityManagerFactory("curso");
        factory.close();













  }

}
