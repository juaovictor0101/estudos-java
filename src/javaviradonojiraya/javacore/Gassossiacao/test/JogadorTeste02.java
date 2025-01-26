package javaviradonojiraya.javacore.Gassossiacao.test;

import javaviradonojiraya.javacore.Gassossiacao.domain.Jogador;
import javaviradonojiraya.javacore.Gassossiacao.domain.Time;

public class JogadorTeste02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Seleção Brasileira");

        jogador1.setTime(time);

        jogador1.imprime();
    }
}
