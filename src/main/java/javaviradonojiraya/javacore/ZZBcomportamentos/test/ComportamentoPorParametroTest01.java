package javaviradonojiraya.javacore.ZZBcomportamentos.test;

import javaviradonojiraya.javacore.ZZBcomportamentos.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    public static void main(String[] args) {
        System.out.println(filtroCarrosVerdes(carros));
        System.out.println(filtroCarrosPorCor(carros, "vermelho"));
        System.out.println(filtroCarrosPorAno(carros, 2010));
    }

    private static List<Car> carros = List.of(new Car("verde", 2008), new Car("preto", 2019), new Car("vermelho", 2001));

    private static List<Car> filtroCarrosVerdes(List<Car> cars) {
        List<Car> carrosVerdes = new ArrayList<>();
        for (Car car : cars) {
            if (car.getCor().equals("verde")) {
                carrosVerdes.add(car);
            }
        }
        return carrosVerdes;
    }

    private static List<Car> filtroCarrosPorCor(List<Car> cars, String cor) {
        List<Car> carrosFiltrados = new ArrayList<>();
        for (Car car : cars) {
            if (car.getCor().equals(cor)) {
                carrosFiltrados.add(car);
            }
        }
        return carrosFiltrados;
    }

    private static List<Car> filtroCarrosPorAno(List<Car> cars, int ano) {
        List<Car> carrosFiltrados = new ArrayList<>();
        for (Car car : cars) {
            if (car.getAno()<ano) {
                carrosFiltrados.add(car);
            }
        }
        return carrosFiltrados;
    }
}
