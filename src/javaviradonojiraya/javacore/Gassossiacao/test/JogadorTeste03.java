package javaviradonojiraya.javacore.Gassossiacao.test;

import javaviradonojiraya.javacore.Gassossiacao.domain.Jogador;
import javaviradonojiraya.javacore.Gassossiacao.domain.Time;

public class JogadorTeste03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafu");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador};

        jogador.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("---Jogador---");
        jogador.imprime();


        System.out.println("---time---");
        time.imprime();

        //Associação bidirericonal
    }
}
