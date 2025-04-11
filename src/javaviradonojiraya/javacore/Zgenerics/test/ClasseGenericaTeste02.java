package javaviradonojiraya.javacore.Zgenerics.test;

import javaviradonojiraya.javacore.Zgenerics.domain.Barco;
import javaviradonojiraya.javacore.Zgenerics.service.BarcoRentavelService;

public class ClasseGenericaTeste02 {
    public static void main(String[] args) {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcoDisponivel();
        System.out.println("Usando o barco por um mês...");
        barcoRentavelService.retornarBarcoAlugado(barco);
    }
}
