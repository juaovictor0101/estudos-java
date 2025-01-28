package javaviradonojiraya.javacore.Gassossiacao.test;

import javaviradonojiraya.javacore.Gassossiacao.domain.Aluno;
import javaviradonojiraya.javacore.Gassossiacao.domain.Local;
import javaviradonojiraya.javacore.Gassossiacao.domain.Professor;
import javaviradonojiraya.javacore.Gassossiacao.domain.Seminario;

public class ExercicioSeminário {
    public static void main(String[] args) {

        Local local01 = new Local("Na rua Rua da morte do batman, cidade de gothan city");
        Aluno aluno01 = new Aluno("João", 23);
        Aluno aluno02 = new Aluno("Maria", 18);
        Aluno[] alunos = {aluno01, aluno02};
        Professor professor01 = new Professor("Bruce wayne", "Coringar");
        Seminario seminario01 = new Seminario("Palestra do coringa ", alunos, local01);
        Seminario[] seminarios = {seminario01};

        System.out.println("--- Dados do Seminario01 ---");
        seminario01.setAlunos(alunos);
        seminario01.setLocal(local01);
        seminario01.imprime();

        System.out.println("---------- Dados do aluno 01 --------- ");
        aluno01.setSeminario(seminario01);
        aluno01.imprime();

        System.out.println("---------- Dados do aluno 02 --------- ");
        aluno02.setSeminario(seminario01);
        aluno02.imprime();

        System.out.println("===== Dados professor ===== ");
        professor01.setSeminarios(seminarios);
        professor01.imprime();


    }
}
