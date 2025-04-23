package javaviradonojiraya.javacore.Minterfaces.domain;

public class DataBaseLoader  implements DataLouder, DataRemover{

    //ordem os moddificadores de acesso do mais restritivo para o mais livre:
    // private -> default -> protected -> public
    /*
    Ao implementar uma interface, se faz necessario sobrescrever os metodos dela que forem abstratos, nesse caso
    se usa a palavra reservada 'implements' para chamar uma interface em uma classe
     */

    //É possível implementar multiplas interface a mesma classes, diferente de herenças que só pode uma.


    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de dados...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Fazendo checagem de permissão para o banco de dados");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na classe Database");
    }
}
