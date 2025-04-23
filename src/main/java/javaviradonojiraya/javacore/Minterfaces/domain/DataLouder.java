package javaviradonojiraya.javacore.Minterfaces.domain;

public interface DataLouder {
    public final static int MAX_DATA_SIZE = 10;

    //É possível adcionar atributos a interfaces,e eles por padrão são constantes

    public abstract void load();

    /*
     Por padrão os metodos de uma interface são todos public e abstract, não se fazendo necessario declará-los
     nesse caso a sintaxe mais correta seria 'void load ();'
     */

    public default void checkPermission() {
        System.out.println("Fazendo checagem de permissões geral...");
    }

    /*
    Diferente de um metodo abstract que precisa ser sobrescrito por todas as classes que implementarem a interface,
    um metodo concreto que é identificado pela palavra reservada 'default', ele traz um corpo ou seja, ele é um sistema em sí
    e não se faz necessário sua sobrescrita sempre que uma nova classe implementar a interface

     */

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }

}
