package javaviradonojiraya.javacore.Kenumeracao.test;

import javaviradonojiraya.javacore.Kenumeracao.domain.Cliente;
import javaviradonojiraya.javacore.Kenumeracao.domain.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {

        Cliente cliente0 = new Cliente("Joaozinho", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.DEBITO);//essa é a forma de chamar enumerações criadas dentro da classe);
        Cliente cliente1 = new Cliente("Atacadao", TipoCliente.PESSOA_JURIDICA, Cliente.TipoPagamento.CREDITO);
        System.out.println(cliente0);
        System.out.println(cliente1);
    }

}
