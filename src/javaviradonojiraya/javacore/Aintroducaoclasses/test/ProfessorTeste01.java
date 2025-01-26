package javaviradonojiraya.javacore.Aintroducaoclasses.test;

import javaviradonojiraya.javacore.Aintroducaoclasses.domain.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.idade = 145;
        professor.sexo = 'M';
        professor.nome = "Jao o Fodao";

        System.out.println("Nome: " + professor.nome + " Idade:" + professor.idade + " Sexo:" + professor.sexo + ".");

        //Coesão de código em OOP é deixar o mais específico possível as classes, de maneira resumida é isso
        // (tema mais abstrato que vou precisar estudar mais conforme vou estudando.

    }
}
