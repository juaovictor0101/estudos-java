package javaviradonojiraya.javacore.LClassesAbstratas.domain;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }
    //chamdando o metodo calcula bonus e usando overrider para sobrescrevela com os dados do bonus da classe Gerente


    @Override
    public void calculaBonus() {
        this.salario = salario + salario * 0.5;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
