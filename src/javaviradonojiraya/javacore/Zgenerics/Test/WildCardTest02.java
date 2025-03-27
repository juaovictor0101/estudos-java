package javaviradonojiraya.javacore.Zgenerics.Test;


import java.util.List;

public class WildCardTest02 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());
    }
    private static void printConsulta(List<? extends Animal> animals){
        for (Animal animal : animals) {
            animal.Consulta();
        }

    }
}
