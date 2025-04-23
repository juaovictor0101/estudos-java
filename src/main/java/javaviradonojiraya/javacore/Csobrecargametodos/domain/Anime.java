package javaviradonojiraya.javacore.Csobrecargametodos.domain;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;

    public Anime (){

    } //CONSTRUTOR

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
    }

    public void init (String nome, String tipo, int episodios){
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }

    public void init (String nome, String tipo, int episodios, String genero){
       this.init(nome, tipo, episodios);
        this.genero = genero;

        /*
        Ao inves de ficar repetindo código e chamando os parametros em um novo init novamente, eu posso só chamar o
         metodo que inicia originalmente os parametros dentro do segundo metodo, nesse caso, chamando o metodo init
         (o primeiro) e passando os parametros que devem ser inicializados, que são "nome", "tipo" e "episodios"

         */

    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getEpisodios() {
        return this.episodios;
    }
}
