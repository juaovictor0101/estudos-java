package javaviradonojiraya.javacore.Ycolecoes.test;

import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List nomes = new ArrayList<>();       // assim era feito até a versão 1.4 do java;
        nomes.add("João");
        nomes.add("Victor");
        nomes.add(122);

        for (Object nome: nomes){
            System.out.println(nome);
        }

        /*A partir do java 1.5 foi incluido essa forma de forçar em tempo de compilação a ser incluido apenas um tipo de
         dado na list tanto que no bloco de código acima ele pede um objeto qualquer e no bloco abaixo ele solicita uma
         String.
         */

        List<String> nomes1 = new ArrayList<>();
        nomes1.add("João");
        nomes1.add("Victor");
        nomes1.remove(0); //remove um valor do array;
        nomes1.remove("Victor");
        //remove os objetos que forem iguais ao que foi passado aqui
        /*
        também é possível adcionar um arraylist dentro de outro por meio do metodo nomes1.addAll(nomes2) por ex, nesse
        caso, estaria incluindo dentro da arrayList nome1, os  dados que há dentro de nomes2
         */
//        nomes1.add(122);
        for (String nome1: nomes1){
            System.out.println(nome1);
        }
//        nomes1.add("Marcos"); //incrementando sem mudar o tamanho do array/declara-lo
//        for (String nome1: nomes1){
//            System.out.println(nome1);
//        }
//        System.out.println("-----------------");

        for (int i=0; i<nomes.size(); i++){
            System.out.println(nomes.get(i));
        }
        //Acima as duas formas de percores um arrayList em Java

        //Ao usar uma List (ou coleções no geral), o tipo precisa obrigatoriamente ser um OBJETO, ou seja, nada de tipos primitivos, ou Wrappers caso necessário

    }
}
