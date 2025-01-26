package javaviradonojiraya.javacore.BintroducaoMetodos.domain;

public class Pessoa {
    private String nome;
    private int idade;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("A idade informada é inválida!");
            return;
        }
        this.idade = idade;
    }

    /*
    - Os dois metodos acima são usados para atribuir valores aos atributos do objeto pessoa, nesse caso 'nome' e 'idade',
    e segue sempre a sintaxe acima;

     */


    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    /*
    Essas formas acima é um metodo para ter acesso ao dados e imprimi-los diretamente na tela, por meio do GET;
     */
}
