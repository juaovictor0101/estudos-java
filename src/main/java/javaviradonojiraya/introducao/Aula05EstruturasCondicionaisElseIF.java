package javaviradonojiraya.introducao;

public class Aula05EstruturasCondicionaisElseIF {
    public static void main(String[] args) {
        /*
        Se idade <15 = Categoria infantil
        Se idade >15 && <18 = Categoria juvenil
        Se idade >=18 = Categoria adulto
        */

        int idade = 17;
//        if(idade< 15){
//            System.out.println("categoria infantil");
//        }else if (idade >= 15 && idade <18){
//            System.out.println("catetoria juvenil");
//        }else{
//            System.out.println(" categoria adulto");
//        }
        /*
        Conforme visto na aulta 03 de estruturas condicionais, onde é citado sobre operador ternário,
         é possível usar ternário em uma estrutura do else if, apesar de não ser uma boa pratica, nesse caso a sintaxe seria:
         Condição? Verdadeiro : Condição? Verdadeiro : Falso, Considerando o exemplo acima, ficaria dessa forma:
         */

        String categoria = idade <15? "categoria infantil": idade>=15 && idade <18? "catetoria juvenil": "categoria adulto";
        System.out.println(categoria);

        //NÃO É UMA BOA PRÁTICA!!!!!!! MAS DA PRA FAZER.
    }
}
