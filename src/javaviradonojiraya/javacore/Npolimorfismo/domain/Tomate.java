package javaviradonojiraya.javacore.Npolimorfismo.domain;

public class Tomate extends Produto {
    public final static double IMPOSTO_PORCENTO = 0.06;
    private String dataValidade;
    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do tomate...");
        return this.valor * IMPOSTO_PORCENTO;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
