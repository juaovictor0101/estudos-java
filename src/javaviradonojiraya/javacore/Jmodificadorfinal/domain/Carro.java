package javaviradonojiraya.javacore.Jmodificadorfinal.domain;

public class Carro {
    private String nome;
//    private final double VELOCIDADE_LIMITE = 250; //Primeira forma de declarar uma constante


//    private final double VELOCIDADE_LIMITE;  // Segunda forma de declarar uma constante
//    {
//        VELOCIDADE_LIMITE = 250;
//    }

    public static final double VELOCIDADE_LIMITE = 250;  //Terceira forma de declarar uma constante
    private final Comprador COMPRADOR = new Comprador();

    //Além da primeira forma descrita, ele pode ser atribuido valor a constante por meio dos blocos de inicialização
    //Tanto o static (quando a variável for desse tipo) quanto em blocos de inicialização comuns, como no exemplo acima.

    /*
    Puxando um exemplo da função de limitar a velocidade de um carro que já foi usado anteriormente quando citado o
    mofificador de acesso "private" que limitamos o acesso direto a mudança do atributo

    Nesse caso, com o modificador "final" é possível declarar um atributo de uma classe que não poderá ser alterado em
    nenhum momento posterior a sua declaração, ou seja, será imutável, damos o nome de CONSTANTE um atributo com esse
    modificador, e por padrão ele precisa ser inicializado sempre por padrão, seja declarando o valor ao dar o nome do
    atributo, seja usando blocos de inicialização, ou até mesmo constructor, como no exemplo acima, que foi limitado a
    250, a declaração de constantes no Java também diz que o nome de constantes deve ser sempre em caps e em caso de
    atributos com mais de uma palavra, deve ser separado pelo underline _
     */

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
