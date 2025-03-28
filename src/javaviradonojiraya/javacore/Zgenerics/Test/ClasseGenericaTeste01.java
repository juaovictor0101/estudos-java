package javaviradonojiraya.javacore.Zgenerics.Test;

import javaviradonojiraya.javacore.Zgenerics.Domain.Carro;
import javaviradonojiraya.javacore.Zgenerics.Service.CarroRentavelService;

public class ClasseGenericaTeste01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarroDisponivel();
        System.out.println("Usando o carro por um mês...");
        carroRentavelService.retornarCarroAlugado(carro);
    }
}
