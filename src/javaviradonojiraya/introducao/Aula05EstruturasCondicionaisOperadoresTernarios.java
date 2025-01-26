package javaviradonojiraya.introducao;

public class Aula05EstruturasCondicionaisOperadoresTernarios {
    public static void main(String[] args) {
        /*Nesses casos onde é criado um If Else, afim de atribuir um valor X a uma variável, pode ser usado o
         operador ternário como alternativa mais rápida e limpa.
        */

        //A sintaxe do operador ternario é:  (condição)? verdadeiro : falso

        double salario = 6000;
        String mensagemDoar = "Eu vou fazer o L e comer picanha";
        String mensagemNaoDoar = "Não vou fazer o L, prefiro pão com rato";
//        String resultado;
//
//        if (salario >5000) {
//            resultado = mensagemDoar;
//        }else {
//            resultado = mensagemNaoDoar;
//        }
//       System.out.println(resultado);

        //No caso do exemplo acima, em ternário ficaria:
        String resultado = salario >5000? mensagemDoar :mensagemNaoDoar;
        System.out.println(resultado);
    }
}
