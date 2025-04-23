package javaviradonojiraya.introducao;

public class Aula06EstruturasDeRepetição {
    public static void main(String[] args) {

        //while, do while, for

        int contador = 9;
        while (contador <10 ){
            System.out.println(contador + "ª");
            contador++;
            //só roda se a condição for verdadeira pelo menos uma vez.
        }

        do {
            System.out.println(contador + "º");
            contador++;
        } while (contador <10);
        //Roda pelo menos uma vez, mesmo que a condição seja falsa

        for (int i=0; i<10; i++){
            System.out.println("For "+ i);

        }
    }
}
