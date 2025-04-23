package javaviradonojiraya.introducao;

import org.w3c.dom.ls.LSOutput;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean
        int idade= 45;
        long numeroGrande = 1000000;
        double salarioDouble = 2000.0;
        float salarioFloat = 3000.0f;
        char caractere = 'M';
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;

        String nome = "Jaum";
        var a = "Jaum";
        /* é possível forçar um tipo de de variárel em outro usando o casting, quando eu quero que uma variável do tipo Double, se apresente como Float, por exemplo é possível declarar ela como " double numDouble = (float) 145,09;" e o número seria considerado float pelo Java de forma forçada;

         */



        System.out.println("A idade é: " + idade + " anos");
        System.out.println("oi meu nome é " +nome);
    }
}
