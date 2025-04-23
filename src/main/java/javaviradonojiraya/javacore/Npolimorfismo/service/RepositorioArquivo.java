package javaviradonojiraya.javacore.Npolimorfismo.service;

import javaviradonojiraya.javacore.Npolimorfismo.repostory.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um arquivo");
    }
}
