package javaviradonojiraya.javacore.Gassossiacao.test;

import javaviradonojiraya.javacore.Gassossiacao.domain.Jogador;

public class JogadorTeste01 {
    public static void main(String[] args) {
        Jogador Jogador1 = new Jogador("Pelé");
        Jogador Jogador2 = new Jogador("Romário");
        Jogador Jogador3 = new Jogador("Cafu");

        Jogador[] jogadores = new Jogador[] { Jogador1, Jogador2, Jogador3};

        //Nesse caso há uma dupla referência aos objetos: Pelé, Romário e Cafú
        //Tanto por parte do Array com as posições 0,1,2 quanto pelas variáveis de referências Jogador1, Jogador2, Jogador3

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }

    }
}
