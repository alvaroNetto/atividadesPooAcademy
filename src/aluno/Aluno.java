package classes_em_java_II;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    String nome;
    String sobrenome;
    String matricula;
    String nomeCurso;
    ArrayList<String> disciplinasAprovadas = new ArrayList<>();
    ArrayList<Double> notasObtidas = new ArrayList<>();
    ArrayList<String> disciplinasAtuais = new ArrayList<>();

    Aluno() {}

    Aluno(String nome, String sobrenome, String matricula, String nomeCurso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.matricula = matricula;
        this.nomeCurso = nomeCurso;
    }

    void atualizarNome(String nome) {
        this.nome = nome;
    }

    void atualizarSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    void atualizarMatricula(String matricula) {
        this.matricula = matricula;
    }

    void atualizarCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

}
