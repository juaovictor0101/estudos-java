package javaviradonojiraya.javacore.Zgenerics.Test;

import javaviradonojiraya.javacore.Zgenerics.Domain.Barco;
import javaviradonojiraya.javacore.Zgenerics.Domain.Carro;
import javaviradonojiraya.javacore.Zgenerics.Service.BarcoRentavelService;
import javaviradonojiraya.javacore.Zgenerics.Service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTeste03 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Ferrari")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Iate"), new Barco("Lancha")));

        RentalService<Carro> carroRentalService = new RentalService<>(carrosDisponiveis);
        Carro carro = carroRentalService.buscarObjetoDisponivel();
        System.out.println("Usando o carro por um mês...");
        carroRentalService.retornarObjetoAlugado(carro);

        System.out.println("-----------------");

        RentalService<Barco> barcoRentalService = new RentalService<>(barcosDisponiveis);
        Barco barco = barcoRentalService.buscarObjetoDisponivel();
        System.out.println("Usando barco por um final de semana...");
        barcoRentalService.retornarObjetoAlugado(barco);
    }
}
