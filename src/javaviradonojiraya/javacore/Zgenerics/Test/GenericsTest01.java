package javaviradonojiraya.javacore.Zgenerics.Test;

import javaviradonojiraya.javacore.Ycolecoes.domain.Consumidor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GenericsTest01 {
    public static void main(String[] args) {
        /*
        Generics foi basicamente uma solução que foi criada para o java para evitar isso que eu fiz a baixo, que seria
        incluir em uma mesma lista, varios tipos de arquivos, com o generics, ele "força" em tempo de compilação que todos
        os elementos adicionados seja de um mesmo tipo, ou seja, caso eu tente incluir um tipo que seja diferente do declarado
        o código nem roda, isso evita que ocorram 'gambiarras' no código que permitam esse tipo de caso
         */

        //Lista sem generics, permite adcionar qualquer tipo de elemento
        List lista = new ArrayList();
        lista.add("Naruto");
        lista.add(125L);
        lista.add(new Consumidor(null,"João"));

        //Lista com generics 'barra' a inclusão de elementos/objetos que não seja o tipo declarado
//        List <String> lista1 = new ArrayList();
//        lista1.add("Naruto");
//        lista1.add(125L);
//        lista1.add(new Consumidor(null,"João"));


        for(Object o: lista){
           if(o instanceof String){
               System.out.println(o);
           }
           if(o instanceof Long){
               System.out.println(o);
           }
           if(o instanceof Consumidor){
               System.out.println(o);
           }
        }
    }
}
