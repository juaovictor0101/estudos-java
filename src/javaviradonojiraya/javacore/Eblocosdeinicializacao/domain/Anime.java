package javaviradonojiraya.javacore.Eblocosdeinicializacao.domain;

public class Anime {
    private String nome;
    private int[]  episodios;
    {
        System.out.println("Bloco de inicialização");
        episodios = new int [100];
        for (int i = 0; i < episodios.length ; i++) {
            episodios[i] = i+1;
        }
    }
    //ORDEM DE ACONTECIMENTO DE UM OBJETO

    // 1- Alocado espaço em memória para o objeto
    // 2- Cada atributo de classe é criado e inicializado com valores default ou com o que for passado
    // 3- Bloco de inicialização é executado
    // 4- Construtor é executado


    /*
    - O bloco de inicialização de instância ou bloco de inicialização é executado todas as vezes que o objeto for criado
    - A diferença dele para o construtor é que alguns códigos não precisam ficar sendo replicados, e colocados uma vez
    dentro do bloco, eles irão ser executados toda vez que um objeto "Anime" for criado.

    - É comumente usado quando se tem algum bloco de código que precisa ser executado sempre que um novo objeto da classe
    for criado;
     */
    public Anime(){
        for (int episodios: this.episodios){
            System.out.print(episodios + " ");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }
}
