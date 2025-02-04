package javaviradonojiraya.javacore.LClassesAbstratas.domain;

public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }


    //chamdando o metodo calcula bonus e usando overrider para sobrescrevela com os dados do bonus da classe desenvolvedor

    @Override
    public void calculaBonus() {
        this.salario = salario + salario * 0.35;
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
