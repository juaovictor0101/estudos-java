package javaviradonojiraya.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List <Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(0);
        numeros.add(4);
        numeros.add(3);
        // (-ponto de inserção) -1) caso não ache nada com o BinarySearch e caso tenha, retorna o indice

        //Index 0,1,2,3
        //Value 0,2,3,4
        Collections.sort(numeros);
        System.out.println(Collections.binarySearch(numeros,2));
        //BinarySearch precisa de uma lista ordenada para tem um resultado confiável;
    }
}
