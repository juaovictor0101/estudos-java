package javaviradonojiraya.javacore.Dconstrutores.domain;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;

    //Contrutor:
    public Anime(String nome, String tipo, int episodios, String genero) {
        this(); //Essa é a forma de chamar um construtor de dentro de outro, e só pode ser chamado assim de dentro de um construtor e precisa ser obrigatoriamente a primeira linha de código dentro do contrutor;
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    //Há a possibilidade de sobrecarregar um construtor assim como um metodo, ou seja, criar um outro construtor
    //com o exato mesmo nome, mas com parametros diferentes, ou sem parametros;

    public Anime(String nome, String tipo, int episodios, String genero, String estudio) {
        this(nome, tipo, episodios, genero); //aqui ele vai localizar o outro construtor e inicializar, para caso seja necessário adcionar mais um atributo ao objeto, como o "estudio" do anime, por ex.
        this.estudio = estudio;
    }

    public Anime (){
        System.out.println("Dentro do construtor sem argumentos");
    }



    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
        System.out.println(this.estudio);
    }


    //CONSTRUTOR é o inicializador dos objetos, caso não sejam declarados, a própria IDE fará isso de forma automática
    // e irá adicionar ao código

    /*
    Usar construtores facilita a forma de adcionar regras aos objetos que serão inicializados, por exemplo nesse caso do ano
    há como solicitar que para que seja criado um novo objeto Anime, seja obrigatório informar: nome, tipo, episodios e genero;
     */

    //O construtor é executado antes de qualquer metodos da classe;



    //
    //    public void init (String nome, String tipo, int episodios){
    //        this.nome = nome;
    //        this.tipo = tipo;
    //        this.episodios = episodios;
    //    }
    //
    //    public void init (String nome, String tipo, int episodios, String genero){
    //       this.init(nome, tipo, episodios);
    //        this.genero = genero;

    //Com a ultilização do construtor para inicializar o objeto, não se faz mais necessário os metodos acima.

        /*
        Ao inves de ficar repetindo código e chamando os parametros em um novo init novamente, eu posso só chamar o
         metodo que inicia originalmente os parametros dentro do segundo metodo, nesse caso, chamando o metodo init
         (o primeiro) e passando os parametros que devem ser inicializados, que são "nome", "tipo" e "episodios"

         */

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}

