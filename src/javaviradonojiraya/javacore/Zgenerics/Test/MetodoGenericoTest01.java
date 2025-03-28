package javaviradonojiraya.javacore.Zgenerics.Test;

import javaviradonojiraya.javacore.Zgenerics.Domain.Barco;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        List<Barco> barcoList = criarArrayComUmObjeto(new Barco("Iate"));
        System.out.println(barcoList);
    }

    private static <T> List<T> criarArrayComUmObjeto (T t){
        return List.of(t);
    }
    private static <T extends Comparable<T>> List<T> criarArrayComUmObjeto(T t){
        return List.of(t);
    }

}

