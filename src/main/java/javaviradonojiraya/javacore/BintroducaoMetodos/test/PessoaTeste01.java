package javaviradonojiraya.javacore.BintroducaoMetodos.test;

import javaviradonojiraya.javacore.BintroducaoMetodos.domain.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
//        pessoa.nome = "Jiraya";
//        pessoa.idade = 50;

        /*
       - Acoplamento = É o quanto uma classe conhece/está conectada e pode interfir no funcionamento da outra
       - Quanto menor o acoplamento, melhor o código está, e uma das formas de obter isso, é com os MODIFICADORES DE ACESSO;
       -Ao invés de usar um metodo e escrevelo assim:

                                     public void imprimeDados(){
                                       System.out.println(this.nome);
                                        System.out.println(this.idade);
                                    }

       - Usando a declaração dos dados tipo public, é possível declara-los privados, e usar de METODOS especificos do java
         para acessa-los, que nesse caso um para atribuir. ao inves de fazer como está no início do código acima, ficaria da seguinte forma:

                                    public void setNome(String nome){
                                                   this.nome =nome;
                                                }

        - O que acontece nesse caso é a passagem de uma referência da variável que recebe um nome que será passado atrás da chamda do metodo
         por meio do "pessoa.seTNome ("Jiraya");" por exemplo, e agora atribui um valor a variável nome, sem ter acesso de fatos a variável,
         por meio do metodo seT, a vantagem disso é que eu deixo mais acoplado o código, onde em caso de problemas no metodo por exemplo, o código
         não quebra e também, eu consigo fazer validações, como por exemplo, se o usuário tentar digitar um número no nome, mostre uma mensagem de erro e etc.

        - Usar o modificador de acesso 'private' faz com que os atributos nome e idade, por exemplo só possam ser acessados pelo objeto
         */



        pessoa.setNome("Jiraya");
        pessoa.setIdade(-10);

        //Usando o metodo setNome e setIdadade para inicializar os valores dos atributos do meu objeto 'pessoa' da minha classe PessoaTeste01;

//       pessoa.imprime();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

        //Aqui estou pegando os dados dos atributos do meu objeto e mostrando eles na tela por meio do metodo GET;
    }
}
