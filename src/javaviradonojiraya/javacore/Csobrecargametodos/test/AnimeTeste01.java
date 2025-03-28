package javaviradonojiraya.javacore.Csobrecargametodos.test;

import javaviradonojiraya.javacore.Csobrecargametodos.domain.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Naruto", "TV", 12, "Ação");
        anime.imprime();

        /*
        Sobrecarga de metodo é ter dois ou mais metodos com o mesmo nome, mas com a quantidade de parametros (variáveis)
        e tipos diferentes, nesse exemplo acima não precisaria criar um "init2" para atribuir o genero, basta abrir um novo init
        que teria esse parametro a mais e inicializálo, o segundo init nesse caso sobrepôe o que veio primeiro, meio que "atualiza" os dados
         */


//
//        anime.setNome("Naruto");  (ISSO AQUI, É A MESMA COISA QUE ACIMA, USANDO O METODO INIT temos o mesmo resultado
//        anime.setTipo("TV");
//        anime.setEpisodios(12);
        /*
        Ao inves de inicializar cada atributo de forma individual, é possível passar todos de uma vez por meio das variáveis
        de referência nome tipo e episodios, quando chamamos o metodo init, que tem essas 3 referências, e adicionamos os valores
        de uma vez só.
         */

    }
}
