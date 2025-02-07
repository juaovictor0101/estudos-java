package javaviradonojiraya.javacore.Npolimorfismo.test;

import javaviradonojiraya.javacore.Npolimorfismo.Repositorio.Repositorio;
import javaviradonojiraya.javacore.Npolimorfismo.servico.RepositorioArquivo;
import javaviradonojiraya.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;
import javaviradonojiraya.javacore.Npolimorfismo.servico.RepositorioMemoria;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();

    }
}
