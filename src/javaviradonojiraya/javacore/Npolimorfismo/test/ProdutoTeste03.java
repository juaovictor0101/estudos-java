package javaviradonojiraya.javacore.Npolimorfismo.test;

import javaviradonojiraya.javacore.Npolimorfismo.domain.Computador;
import javaviradonojiraya.javacore.Npolimorfismo.domain.Produto;
import javaviradonojiraya.javacore.Npolimorfismo.domain.Tomate;
import javaviradonojiraya.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);

        Tomate tomate = new Tomate("Cereja", 20);
        tomate.setDataValidade("11/12/2021");

        CalculadoraImposto.CalcularImposto(tomate);
        System.out.println("------------------------");
        CalculadoraImposto.CalcularImposto(produto);

    }
}
