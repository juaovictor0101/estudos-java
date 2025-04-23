package javaviradonojiraya.javacore.Hheranca.test;

import javaviradonojiraya.javacore.Hheranca.domain.Funcionario;

public class HerancaTest02 {
    // 0 - Bloco de inicialização static da super classe é executado quando a JVM carregar a classe pai
    // 1- Bloco de inicialização static da sub classe é executado quando a JVM carrega a classe filha;
    // 2- Alocado espaço em memória para o objeto da classe pai
    // 3- Cada atributo de classe é criado e inicializado com valores default da classe pai ou com o que for passado
    // 4- Bloco de inicialização da super classe é executado
    // 5- Construtor da super classe é executado
    // 6 - Alocado espaço em memória para o objeto da classe filha/ sub classe
    // 7- Cada atributo da sub classe é criado e inicializado com valores default da classe pai ou com o que for passado da classe pai
    // 8- Bloco de inicialização da subclasse/ classe filha é executado
    // 9- Construtor da sub classe é executado

    // ** conteudo importante para tirar certificação de programador java pela oracle, é cobrado essa ordem de inicialização**

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Kakashi");

    }
}
