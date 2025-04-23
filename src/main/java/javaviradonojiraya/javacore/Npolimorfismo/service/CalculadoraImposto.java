package javaviradonojiraya.javacore.Npolimorfismo.service;

import javaviradonojiraya.javacore.Npolimorfismo.domain.Produto;
import javaviradonojiraya.javacore.Npolimorfismo.domain.Tomate;

public class CalculadoraImposto {
//    public static void CalcularImpostoComputador (Computador computador){
//        System.out.println("Relatorio de imposto do computador");
//        double imposto = computador.calcularImposto();
//        System.out.println("Computador "+ computador.getNome());
//        System.out.println("Valor do computador "+ computador.getValor());
//        System.out.println("Valor do imposto sobre o computador " + imposto);
//    }
//
//    public static void CalcularImpostoTomate (Tomate tomate){
//        System.out.println("Relatorio de imposto do tomate");
//        double imposto = tomate.calcularImposto();
//        System.out.println("Tomate "+ tomate.getNome());
//        System.out.println("Valor do Tomate"+ tomate.getValor());
//        System.out.println("Valor do imposto sobre o tomate" + imposto);
//    }
    /*Ao inves de ficar usando um metodo diferente para cada tipo de produto, é possível usar o polimorfismo para
    deixar um metodo mais generico e que seja possível ser aplicado em todas as classes de uma vez só, usando a
    superclasse como referência, ao inves dos dois metoodos acima, é possível escrever um só dessa forma:
     */

    public static void CalcularImposto(Produto produto){
        System.out.println("Relatório de imposto");
        double imposto= produto.calcularImposto();
        System.out.println("Produto: "+ produto.getNome());
        System.out.println("Valor: "+ produto.getValor());
        System.out.println("Imposto a ser pago: "+ imposto);

        if (produto instanceof Tomate){
            String dataValidade = ((Tomate)produto).getDataValidade();
            System.out.println(dataValidade);
            /*
            Fazendo a validação de um tipo mais especifico para um mais generico, para usar metodos especificos, usando
            a palavra reservada instanceof para verificar se o produto é uma instancia do objeto tomate para usar o metodo

             */
        }
    }

    /*
    Agora, ao inves de um metodo para cada subclasse, eu tenho um metodo generico, que poderá ser usado por todas as
    subclasses que tiver em produto, deixando o código mais escalável e de mais fácil manutenção.
     */

}
