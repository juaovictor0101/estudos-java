package javaviradonojiraya.javacore.Gassossiacao.domain;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Local local;

    //Um seminário deve ter um local e pode muitos ou nenhum aluno;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario(String titulo, Aluno[] alunos) {
        this.titulo = titulo;
        this.alunos = alunos;
    }

    public Seminario(String titulo, Aluno[] alunos, Local local) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.local = local;
    }

    public void imprime() {
        System.out.println("Seminario: " + this.titulo);
        if (alunos != null) {
            for (Aluno aluno : alunos) {
                System.out.println("Nome do aluno participante: " + aluno.getNome());
                System.out.println("Idade do aluno: " + aluno.getIdade());
            }
        }
        if (local != null) {
            System.out.println(local.getEndereco());
        }
        System.out.println();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
