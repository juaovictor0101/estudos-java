package javaviradonojiraya.introducao;

public class Aula07ArraysForEach {
    public static void main(String[] args) {

        //formas de declarar um array em Java

        int [] numero = new int [3];
        int [] numero2= {1,2,3};
        int [] numero3= new int [] {1,2,3,4};


                //outra forma de expor arrays, usando forEach

        for(int i:numero2){
            System.out.println(i);
        }

//        Usando ForEach, ele basicamente mapea o array
//        todo para que seja mostrado na tela, no entanto não há como acessar indices especificos
    }
}
