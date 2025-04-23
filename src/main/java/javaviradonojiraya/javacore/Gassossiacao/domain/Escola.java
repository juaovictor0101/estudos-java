package javaviradonojiraya.javacore.Gassossiacao.domain;

public class Escola {
   //Nesse caso é um exemplo de assosiação muitos (professor) para um (escola)
    private String nome;
    private Professor[] professores;

    public Escola(String nome) {
        this.nome = nome;
    }

    public Escola(String nome, Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    //Sobrecarregando o constructor para que possa ser criado uma escola com e sem professor associado a ela


    public void imprime() {
        System.out.println(this.nome);
        if (professores == null) return; //validação se o objeto professor foi inicializado para que possa ser impresso
        for (Professor professor : professores) {
            System.out.println(professor.getNome());
        }


    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }
}
