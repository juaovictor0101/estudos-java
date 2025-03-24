package javaviradonojiraya.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConversaoTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        Integer[] listToArray = numeros.toArray((new Integer[0]));
        System.out.println(Arrays.toString(listToArray));
        System.out.println("----------------");

        Integer[] numerosArray = new Integer[3];
        numerosArray[0] = 1;
        numerosArray[1] = 2;
        numerosArray[2] = 3;

        List <Integer> arrayToList = Arrays.asList(numerosArray); //asList cria uma lista identifca com o array original, o que em casos de mudanças no array, pode alterar a lista criada, eles são interligados
        arrayToList.set(0,12);
//        arrayToList.add(19); //também não é possivél adcionar valores a lista criada com asList
        System.out.println(Arrays.toString(numerosArray));
        System.out.println(arrayToList);

        System.out.println("------------------------");

        List <Integer> numerosList = new ArrayList<>(Arrays.asList(numerosArray));
        numerosList.add(15);
        System.out.println(numerosList);
    }
}
