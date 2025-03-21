package javaviradonojiraya.javacore.Xserialization.teste.domain;

import java.io.Serializable;

public class Aluno implements Serializable {
    private Long ID;
    private String Nome;
    private String password;

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
