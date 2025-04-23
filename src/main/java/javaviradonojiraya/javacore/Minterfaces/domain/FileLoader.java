package javaviradonojiraya.javacore.Minterfaces.domain;

public class FileLoader implements DataLouder, DataRemover{

    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados de um arquivo...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Fazendo checagem de permissão para um arquivo");
    }
}
