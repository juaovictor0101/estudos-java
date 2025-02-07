package javaviradonojiraya.javacore.Npolimorfismo.servico;

import javaviradonojiraya.javacore.Npolimorfismo.Repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em memoria");
    }
}
