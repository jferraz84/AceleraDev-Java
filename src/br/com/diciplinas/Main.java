package br.com.diciplinas;

import br.com.alunos.Aluno;
import br.com.professor.Professor;
import br.com.usuarios.Usuario;
import br.com.usuarios.repositorios.RepositorioUsuario;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import sun.security.validator.ValidatorException;

public class Main {
    public static void main(String[] args) {

        RepositorioUsuario repositorioUsuario = new RepositorioUsuario();

        try {
           Professor professor = new Professor("professor", "050.277.939-01", "Jorge");
           Aluno aluno = new Aluno("12345", "346.796.528-88", "Aline Santos Ferraz");

           repositorioUsuario.add(professor);
            repositorioUsuario.add(aluno);
           repositorioUsuario.findAll().stream().forEach(System.out::println);

           /*Disciplina disciplina = new Disciplina("Matematica", professor);
           disciplina.matricular(new Aluno("12345", "346.796.528-88", "Aline Santos Ferraz"));
            disciplina.matricular(new Aluno("54321", "346.796.528-80", "Helo Ferraz"));
             disciplina.matricular(new Aluno("13579", "346.796.528-81", "Heloa ferraz"));
           disciplina.mostrarAlunos();*/

        } catch (ValidatorException e) {
            System.out.println(e.getMessage());
        }
    }
}
