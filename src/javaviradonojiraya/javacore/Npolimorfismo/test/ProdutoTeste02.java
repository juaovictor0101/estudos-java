package javaviradonojiraya.javacore.Npolimorfismo.test;

import javaviradonojiraya.javacore.Npolimorfismo.domain.Computador;
import javaviradonojiraya.javacore.Npolimorfismo.domain.Produto;
import javaviradonojiraya.javacore.Npolimorfismo.domain.Tomate;

public class ProdutoTeste02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000); //usando a superclasse como variável de referência e chamando a subclasse no objeto
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());

        System.out.println("---------------");

        Produto produto2 = new Tomate("Cereja", 20);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());

    }
}
