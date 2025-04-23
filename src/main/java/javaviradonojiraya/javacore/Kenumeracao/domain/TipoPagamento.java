package javaviradonojiraya.javacore.Kenumeracao.domain;

public enum TipoPagamento {
    DEBITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 01;
        }
    }, CREDITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05; //usando sobrescritas de metodos dentro de enumerações
        }
    };

    public double calcularDesconto(double valor) {
        return 0;
    }
    //É possível usar enumeração diretamente dentro da classe também
}