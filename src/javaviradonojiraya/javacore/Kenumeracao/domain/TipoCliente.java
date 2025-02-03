package javaviradonojiraya.javacore.Kenumeracao.domain;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa jurídica");

    public final int VALOR;
    public final String nomeR;

    TipoCliente(int valor, String nomeRelatorio) {
        this.VALOR = valor;
        this.nomeR = nomeRelatorio;
    }
    //usando construtores em enumerações

    /*enumerações é um tipo especial de classe, onde os atributos associados a ela não podem ser alterados
     é útil quando há uma escolha em um escopo limitado e você quer forçar o usuário/desenvolvedor
    a usarem os tipos pré-definidos, é basicamente a criação de uma constante, mas de uma forma mais ampla e limpa.

     */

}
