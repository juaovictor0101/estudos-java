package javaviradonojiraya.javacore.Ycolecoes.test;

import javaviradonojiraya.javacore.Ycolecoes.domain.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmatphoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "Iphone");
        Smartphone s2 = new Smartphone("22222", "Pixel");
        Smartphone s3 = new Smartphone("33333", "Samsung");
        List<Smartphone> smartphones = new ArrayList<>(6);
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);
//        smartphones.clear(); //deleta todos os registros que tem na arrayList e mantem a variável de referencia;
//        Smartphone s4 = new Smartphone("44444", "Motorola");
//        smartphones.add(s4);
        //agora ao imprimir terá apenas o s4;
        for(Smartphone smartphone: smartphones){
            System.out.println(smartphone);
        }
        Smartphone s4 = new Smartphone("22222", "Pixel");
        System.out.println(smartphones.contains(s4));
        int IndexSmartPhone4 = smartphones.indexOf(s4); //indexOf busca um semelhante ao que foi passado e retorna seu indice ou -1 caso não haja nenhum igual ao que foi passado
        System.out.println(smartphones.get(IndexSmartPhone4));

    }
}
