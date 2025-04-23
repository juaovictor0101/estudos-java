package javaviradonojiraya.javacore.Zgenerics.test;

import javaviradonojiraya.javacore.Zgenerics.domain.Carro;
import javaviradonojiraya.javacore.Zgenerics.service.CarroRentavelService;

public class ClasseGenericaTeste01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarroDisponivel();
        System.out.println("Usando o carro por um mês...");
        carroRentavelService.retornarCarroAlugado(carro);
    }
}
