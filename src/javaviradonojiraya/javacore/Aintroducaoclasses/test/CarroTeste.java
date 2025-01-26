package javaviradonojiraya.javacore.Aintroducaoclasses.test;

import javaviradonojiraya.javacore.Aintroducaoclasses.domain.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2= new Carro();

        carro.nome = "Honda";
        carro.ano = 2015;
        carro.modelo= "Civic";

        carro2.nome = "Toyota";
        carro2.ano = 2015;
        carro2.modelo= "Corolla";

        /*
        Um objeto pode referenciar outro também, nesse caso, há como fazer
        com que o 'carro' tenha os mesmo valores que o carro2 e viceversa,
        da seguinte maneira:
         */

        carro2 = carro;

        System.out.println("O primeiro carro é um " + carro.nome + " "+ carro.modelo+ " ano " + carro.ano);
        System.out.println("O segundo carro é um " + carro2.nome + " "+ carro2.modelo+ " ano " + carro2.ano);

    }
}
