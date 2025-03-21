package javaviradonojiraya.javacore.Xserialization.teste.domain;

import java.io.Serializable;

public class Aluno implements Serializable {
    private Long ID;
    private String Nome;
    private transient String password;
    private Turma turma;
    //ao seriealizar os atributos de um objeto, em campos sensíveis como senhas, pode se usar o 'transiente' para informa que não deve ser serializado.

    private static String nomeEscole = "TesteEscola123";
    //atributos estáticos não são serializados, pois são atributos do objeto, mas da classe aluno, e não do objeto aluno;


    public Aluno(Long ID, String nome, String password) {
        this.ID = ID;
        Nome = nome;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "ID=" + ID +
                ", Nome='" + Nome + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
