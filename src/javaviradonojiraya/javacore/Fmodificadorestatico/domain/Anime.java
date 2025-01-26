package javaviradonojiraya.javacore.Fmodificadorestatico.domain;

public class Anime {
    private String nome;
    private static int[]  episodios;

    static{
        System.out.println("Bloco de inicialização estaticos 1");
        episodios = new int [100];
        for (int i = 0; i < episodios.length ; i++) {
            episodios[i] = i+1;
        }
    }

    static {
        System.out.println("Bloco de inicialização estaticos 2");
    }

    static {
        System.out.println("Bloco de inicialização estaticos 3");
    }

    {
        System.out.println("Bloco de inicialização não estatico");
    }


    /*
    Quando se tem mais de um bloco de inicialização estatico, todos eles serão carregados na ordem que
    escritos no código, seguindo a regra de serem executados apenas 1 vez cada

    Há a possibilidade de usar blocos não estaticos (que serão executados sempre que um novo objeto for criado)
    e blocos de inicialização estaticos que serão executados apenas uma vez;

     */


    //ORDEM DE ACONTECIMENTO DE UM OBJETO

    //0 - Bloco de inicialização static é executado quando a JVM carregar a classe
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
        for (int episodios: Anime.episodios){
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

}
