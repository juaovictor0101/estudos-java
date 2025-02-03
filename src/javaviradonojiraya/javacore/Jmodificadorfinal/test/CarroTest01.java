package javaviradonojiraya.javacore.Jmodificadorfinal.test;

import javaviradonojiraya.javacore.Jmodificadorfinal.domain.Carro;
import javaviradonojiraya.javacore.Jmodificadorfinal.domain.Comprador;
import javaviradonojiraya.javacore.Jmodificadorfinal.domain.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();

//        carro.COMPRADOR2 = new Comprador(); //tentativa de mudar a referência do comprador1 para o 2
        System.out.println (Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR2);
        carro.COMPRADOR2.setNome("joquinha");
        System.out.println(carro.COMPRADOR2);
        //exemplo que não é possível mudar a referência, mas que é possível alterar dados do objeto

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Enzo");
        ferrari.imprime();
    }
}
