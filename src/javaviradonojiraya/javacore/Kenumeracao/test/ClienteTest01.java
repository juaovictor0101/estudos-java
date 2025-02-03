package javaviradonojiraya.javacore.Kenumeracao.test;

import javaviradonojiraya.javacore.Kenumeracao.domain.Cliente;
import javaviradonojiraya.javacore.Kenumeracao.domain.TipoCliente;
import javaviradonojiraya.javacore.Kenumeracao.domain.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {

        Cliente cliente0 = new Cliente("Joaozinho", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO); //essa é a forma de chamar enumerações criadas dentro da classe);
        Cliente cliente1 = new Cliente("Atacadao", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);
        System.out.println(cliente0);
        System.out.println(cliente1);
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));

        TipoCliente tipoCliente2 = TipoCliente.tipoPorNomeRelatorio("Pessoa Física");
        System.out.println(tipoCliente2);
    }

}
