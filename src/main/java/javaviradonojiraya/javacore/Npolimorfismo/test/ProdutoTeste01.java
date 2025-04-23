package javaviradonojiraya.javacore.Npolimorfismo.test;

import javaviradonojiraya.javacore.Npolimorfismo.domain.Computador;
import javaviradonojiraya.javacore.Npolimorfismo.domain.Televisao;
import javaviradonojiraya.javacore.Npolimorfismo.domain.Tomate;
import javaviradonojiraya.javacore.Npolimorfismo.service.CalculadoraImposto;

public class ProdutoTeste01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Macbook", 11000);
        Tomate tomate = new Tomate(" Italiano", 10);
        Televisao televisao = new Televisao("QLED 50\" ", 5000);


        CalculadoraImposto.CalcularImposto(computador);
        System.out.println("-----------------------------");
        CalculadoraImposto.CalcularImposto(tomate);
        System.out.println("-----------------------------");
        CalculadoraImposto.CalcularImposto(televisao);

        //Ultilizando o mesmo metodo generico da superclasse, para as três subclasses;
    }
}
