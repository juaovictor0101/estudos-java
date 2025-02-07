package javaviradonojiraya.javacore.Npolimorfismo.domain;

public class Televisao extends Produto{
    public final static double IMPOSTO_PORCENTO = 0.21;
    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto da TV...");
        return this.valor * IMPOSTO_PORCENTO;
    }
}
