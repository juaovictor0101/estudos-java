package javaviradonojiraya.javacore.Zgenerics.Test;

import javaviradonojiraya.javacore.Zgenerics.Domain.Barco;
import javaviradonojiraya.javacore.Zgenerics.Domain.Carro;
import javaviradonojiraya.javacore.Zgenerics.Service.BarcoRentavelService;
import javaviradonojiraya.javacore.Zgenerics.Service.CarroRentavelService;

public class ClasseGenericaTeste02 {
    public static void main(String[] args) {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcoDisponivel();
        System.out.println("Usando o barco por um mês...");
        barcoRentavelService.retornarBarcoAlugado(barco);
    }
}
