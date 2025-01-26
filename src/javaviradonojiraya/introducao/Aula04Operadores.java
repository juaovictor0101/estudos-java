package javaviradonojiraya.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {

        // + - / * (operadores matemáticos básicos)
        float numero1 = 10;
        float numero2 = 20;

        System.out.println(numero1+numero2);
        System.out.println(numero1-numero2);
        System.out.println(numero1/numero2);
        System.out.println(numero1*numero2);


        //% (operador de resto de divisão)
        int resto = 20%3;
        System.out.println(resto);


        //Operadores relacionais: > (maior que) ,  <(menor que), >= (maior igual), <= (menor igual), ==(igual a), != (diferente)

        //sempre retornam valores boleanos

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezMaiorIgualQueVinte = 10 >= 20;
        boolean isDezMenorIgualQueVinte = 10 <= 20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezDiferenteVinte = 10!=20;

        System.out.println(isDezMaiorQueVinte);
        System.out.println( isDezDiferenteVinte);
        System.out.println( isDezMenorQueVinte);
        System.out.println( isDezMaiorIgualQueVinte);
        System.out.println( isDezMenorIgualQueVinte);
        System.out.println( isDezDiferenteVinte);
        System.out.println(isDezIgualQueVinte);

        /*Operadores Lógicos:
         And == &&
        || == Or
         ! == Not

         */

        int idade = 35;
        float salario= 3500F;
        boolean isDentroDaLei= idade>30 && salario>=4612;
        System.out.println(isDentroDaLei);

        boolean isDentroDaLeiMenorQueTrinta= idade<30 && salario >=3381;
        System.out.println(isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca= 10000;
        float valorPlayCinco = 5000;
        boolean isPlayCincoCompravel = valorTotalContaCorrente >valorPlayCinco || valorTotalContaPoupanca >valorPlayCinco;
        System.out.println("Consigo comprar o play?" +isPlayCincoCompravel);

        //Operadores de Atribuição: =, +=, -=, /=, %=

        double bonus = 1800;
        bonus+= 1000;//2800
        bonus-= 1000; //1800
        bonus *=2; // 3600

        //operadores de incremento ++, --



    }
}
