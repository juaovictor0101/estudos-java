package javaviradonojiraya.javacore.Isobrescrita.domain;

public class Anime extends Object{

    private String nome;

    /*
    - Da mesma que é possível sobrescrever metodos que o próprio desenvolvedor fez, é possível fazer o mesmo com os nativos
     do Java, como nesse caso o "toString", que é um metodo da classe "Objetc" que é superclasse de todas as classes
     criadas em java, usando o @Override para que ele notifique caso tenha algum erro na escrita do metodo que está
     chamando para sobrescrever, caso eu digitasse "toStrings" por ex, com um "s" a mais, ele daria um erro de compilação
     ao invés de criar um metodo novo

    Após feito o uso desse @Override, e chamar o metodo, é possível fazer alterações a bel prazer.

    - Obedecendo as regras que ao sobrescrever o metodo, ele precisa ter exatamente o mesmo nome e tem que seguir os mesmos
    parametros, ou seja, se tiver 1 no original, terá que ter 1 no sobrescrito também, se não houver nenhum, da mesma forma

    - O mooficador de acesso não pode ser mais restritivo que o original, nesse caso, como public é o mais aberto, não
    pode ser alterado por nenhum outro, no entanto em caso de um metodo private por ex, ele por ir para protected ou
    public sem problemas, pois são MENOS restritivos que o original

    - O tipo de retorno TEM que ser uma classe ou uma subclasse (covariância de retorno)

    ** Usando o atalho (alt + insert) abre uma página que cria o metodo especifico do toStrong automático, para que não
    seja preciso cria-lo sempre que for ser utilizado na mão.**
            */

    @Override
    public String toString() {
        return "Anime{" +
                "nome='" + nome + '\'' +
                '}';
    } //esse é o feito pela IDE

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
