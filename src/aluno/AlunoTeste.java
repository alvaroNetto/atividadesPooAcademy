package classes_em_java_II;

import java.util.Arrays;

public class AlunoTeste {

    public static void main(String[] args) {

        Aluno aluno = new Aluno("Caio", "Francelino", "123213", "Eng. Software");

        aluno.disciplinasAprovadas.add("Programação Orientada a Objetos");
        aluno.notasObtidas.add(10.0);

        aluno.disciplinasAtuais.add("Cálculo 3");
        aluno.disciplinasAtuais.add("Estrutura de Dados 3");

        aluno.disciplinasAprovadas.add(aluno.disciplinasAtuais.get(0));
        aluno.notasObtidas.add(8.5);
        aluno.disciplinasAtuais.remove(0);

        System.out.println("Quantidade de disciplinas aprovadas: " + aluno.disciplinasAprovadas.size());
        System.out.println("Quantidade de disciplinas atuais: " + aluno.disciplinasAtuais.size());

        System.out.println("Dados do aluno");
        System.out.println("Nome: " + aluno.nome + " " + aluno.sobrenome);
        System.out.println("Matricula: " + aluno.matricula);
        System.out.println("Curso: " + aluno.nomeCurso);

        double notaMedia = 0.0;

        for(double nota : aluno.notasObtidas) {
            notaMedia += nota;
        }

        notaMedia = notaMedia / aluno.notasObtidas.size();

        System.out.println("Nota média: " + notaMedia);
    }

}
