package javaviradonojiraya.javacore.Npolimorfismo.servico;

import javaviradonojiraya.javacore.Npolimorfismo.Repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um arquivo");
    }
}
