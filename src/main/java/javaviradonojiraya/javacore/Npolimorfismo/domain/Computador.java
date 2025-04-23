package javaviradonojiraya.javacore.Npolimorfismo.domain;

public class Computador extends Produto {
    public final static double IMPOSTO_PORCENTO = 0.21;

    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do computador...");
        return this.valor * IMPOSTO_PORCENTO;
    }


}
