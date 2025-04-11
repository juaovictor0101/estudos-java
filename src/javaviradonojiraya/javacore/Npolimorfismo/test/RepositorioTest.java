package javaviradonojiraya.javacore.Npolimorfismo.test;

import javaviradonojiraya.javacore.Npolimorfismo.repostory.Repositorio;
import javaviradonojiraya.javacore.Npolimorfismo.service.RepositorioBancoDeDados;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();

    }
}
