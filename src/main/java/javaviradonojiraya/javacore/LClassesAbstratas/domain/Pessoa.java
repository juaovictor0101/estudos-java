package javaviradonojiraya.javacore.LClassesAbstratas.domain;

public abstract class Pessoa {
    public abstract void imprime();

    /* Se houver uma classe abstrata que extend ou seja, herda os metodos dela, nesse exemplo, Funcionario.Java extend os
        metodos de Pessoa, e ambas são abstratas, a classe funcionario em si nao é obrigada a implementar os metodos dela
        porém, a primeira classe concreta que houve nessa ordem, terá que implementa-lo obrigatoriamente
     */
}
