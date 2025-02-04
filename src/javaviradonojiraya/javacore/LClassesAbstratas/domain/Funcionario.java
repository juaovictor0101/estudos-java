package javaviradonojiraya.javacore.LClassesAbstratas.domain;

public abstract class Funcionario extends Pessoa{
    protected String nome;
    protected double salario;

    /*Uma classe abstrata é basicamente uma classe que não pode ter um objeto instanciado baseado nela, ou seja,
   não pode haver um objeto da classe funcionario, esse tipo de classe é interessante quando é necessário um modelo geral para classes herdeiras
   nesse caso, a classe Gerente.Java, está herdando as funções e atributos de Funcionario.Javas, numa empresa, onde há diversos tipos de funcionarios
   para que não seja preciso declarar os atributos de cada tipo de funcionario, é possível criar uma super classe abstrata com os dados comuns a todos
   os funcionarios e a partir dela criar as demais herdando esses atributos comuns e adcionando as suas especificidades.
     */


    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }


//    public void calculaBonus() {
//        this.salario = salario + salario * 0.1;
//    }
    /*nesse caso, o bonus de salario iria para todos os funcionarios, mas usando metodos abstratos, é possível
    apenas introduzir o metodo aqui, deixando ele sem corpo e sem valor, e especificar em cada funcionario qual seria o
    valor do bonus

   */

    //Deixando o código assim:

    //Metodos abstratos só pode existir dentro de classes abstratas

    public abstract void calculaBonus();

    @Override
    public void imprime() {
        System.out.println("Imprimindo...");
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
