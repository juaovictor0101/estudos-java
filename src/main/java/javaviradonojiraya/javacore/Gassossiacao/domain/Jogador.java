package javaviradonojiraya.javacore.Gassossiacao.domain;

public class Jogador {

    /*
    Assossiação é a criação de relações entre classes e objetos, por ex

    Jogador 1 -- 1 personagem ( relação 1 para 1)
    time 1 -- N jogador (relação 1 para muitos)
    Jogador N -- time 1 (relação muitos para 1)
    Estudante N -- N cursos (relação muitos para muitos)
     */

    //Nesse exemplo se trata da relação um (time) para muitos (jogador)
    private String nome;
    private Time time;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public void imprime (){
        System.out.println(this.nome);
        if (time != null){
            System.out.println(time.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
