package javaviradonojiraya.javacore.LClassesAbstratas.test;

import javaviradonojiraya.javacore.LClassesAbstratas.domain.Desenvolvedor;
import javaviradonojiraya.javacore.LClassesAbstratas.domain.Funcionario;
import javaviradonojiraya.javacore.LClassesAbstratas.domain.Gerente;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Zami", 5000);
        System.out.println(gerente);
        Desenvolvedor dev = new Desenvolvedor("Jaum", 4000);
        System.out.println(dev);
        gerente.imprime();
        dev.imprime();
    }
}
