package javaviradonojiraya.javacore.Hheranca.domain;

public class Funcionario extends Pessoa {
    private double salario;

    /*
     *
     *     Herança fala da extensão das funcionalidades de alguma classe, no exemplo, temos um funcionario que além das caractéristicas
     *     da classe pessoa, inclui uma outra, que nesse caso seria um salário;
     *
     *     Quando usado o extend + referência de outra classe, faz com que o a classe funcionario herde todos os
     *     parametros e metodos dessa classe.
     *
     *     O uso da herança implica num forte acoplamento do código, ou seja, uma vez feito, qualquer alteração que eu fizer na
     *     classe pessoa, terá um grande impacte nas outras classes que herdarem seus parametros, metodos e quaisquer alterações
     *
     *     Não é possivel a herança de multiplas classes pelo java, como por exemplo funcionario herdas os atributos e metodos
     *     da classe Aluno, por exemplo.
     *
     *
     *     Herença = "é um"
     *     Associação = "tem um";
     *
     *     para ter acesso aos atributos da classe superior a funcionario (nesse exemplo pessoa) pode ser feito por meio do
     *     modificador de acesso "protected" que faz com que as sub-classes que herderam os atributos e metodos da classe que declarar
     *     atributos com esse modificador, tenha livre acesso para alterá-lo e modificalo, como se fosse delas em qualquer lugar (qualquer outro pacote);
     *
     *     No entando, o uso desse modificador libera o acesso aos atributos para todas as outras classes que estiverem no mesmo
     *     pacote que a classe "mãe"
     *
     *     Por padrão todo
     *
     */
    static {
        System.out.println("Dentro do bloco estatico da classe Funcionario");
    }

    {
        System.out.println("Bloco de inicialização da classe Funcionario");
    }

    {
        System.out.println("Bloco de inicialização da classe Funcionario");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor da classe Funcionario");
        //usando a função super, para chamar o construtor da classe mãe (Pessoa) para que seja inicializado sempre que uma
        //nova sub classe seja criada, agora sempre que um novo funcionário for criádo será necessário informar ao menos um nome.
    }


    public void imprime() {
        super.imprime();
        /*
          metodo super faz com que consiga chamar um metodo da classe mais generica (superclass), nesse caso a
          classe pessoa, dai eu forço a execução do metodo da outra classe, porém considerando os atributos da classe
          funcionario, e após isso é adcionado o atributo novo do salário.
         */
        System.out.println(this.salario);
    }

    public void relatorioSalario() {
        System.out.println("Eu " + this.nome + " recebi o salario de: " + this.salario);

        //tendo acesso a atributos diretos da classe mãe (superclass) devido ao modificador protected
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
