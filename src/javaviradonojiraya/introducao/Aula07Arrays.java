package javaviradonojiraya.introducao;

public class Aula07Arrays {
    public static void main(String[] args) {

        //se inicia com o "new int" o que atribui a todos os elemtos do array o valor 0, caso não sejam atribuidos valores após iniciado, se manterá em 0 em arrays do tipo INT, BYTE, SHORT, LONG e DOUBLE;
        //char = '\u0000'
        //boolean = false
        //String (e todos do tipo reference) = null


        int[] idades = new int[3];
        idades[0] = 16;
        idades[1] = 17;
        idades[2] = 18;

//        System.out.println(idades[0]);
//        System.out.println(idades[1]);
//        System.out.println(idades[2]);

        //para imprimir um array pode ser usado o for também, conforme exemplo:

        for (int i = 0; i < idades.length; i++)
            System.out.println(idades[i]);
    }
}
