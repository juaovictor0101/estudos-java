package javaviradonojiraya.javacore.ZZBcomportamentos.test;

import javaviradonojiraya.javacore.ZZBcomportamentos.domain.Car;
import javaviradonojiraya.javacore.ZZBcomportamentos.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest03 {
    private static List<Car> carros = List.of(new Car("verde", 2008), new Car("preto", 2019), new Car("vermelho", 2001));

    public static void main(String[] args) {
        List<Car> carrosVerde = filtro(carros, car -> car.getCor().equals("verde"));
        System.out.println(carrosVerde);
        List<Car> carrosVermelho = filtro(carros, car -> car.getCor().equals("vermelho"));
        System.out.println(carrosVermelho);
        List<Car> carrosPretos = filtro(carros, car -> car.getCor().equals("preto"));
        System.out.println(carrosPretos);
        List<Car> carrosPorAno = filtro(carros, car -> car.getAno() < 2010);
        System.out.println(carrosPorAno);

    }

    //generalizando ainda mais o filtro
    private static <T> List<T> filtro(List<T> list, Predicate<T> predicate) {
        List<T> listaFiltrada = new ArrayList<>();
        for (T e : list) {
            if (predicate.test(e)) {
                listaFiltrada.add(e);
            }
        }
        return listaFiltrada;
    }
}
