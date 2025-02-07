package javaviradonojiraya.javacore.Npolimorfismo.servico;

import javaviradonojiraya.javacore.Npolimorfismo.Repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um banco de dados");
    }
}
