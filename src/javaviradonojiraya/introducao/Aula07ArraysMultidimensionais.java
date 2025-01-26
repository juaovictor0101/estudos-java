package javaviradonojiraya.introducao;

public class Aula07ArraysMultidimensionais {
    public static void main(String[] args) {
        //Arrays multidimensionais são nada menos que arrays, onde cada elemento de um array principal, faz referencia a um outro array.
        //Por exemplo os meses, o mês 1 (janeiro) que ficaria na posicação 0, faz referencia ao mesmo de janeiro, que tem 31 dias (que são elementos de um novo array)

        //EX: 1,2,3,4,5 -> Meses
        //EX: 31,28,31,39 -> Quantidade de dias em cada mês, nesse caso o mês 1(um) tem elementos (dias);

        //A sintaxe de arrays multidimensionais em matamática fica da seguinte forma:

        int [][] dias = new int [3][3]; //Nesse caso é obrigatório apenas declarar a base da array (primeiras chaves, que nesse caso é 3) dimensional, os demais não se faz obrigatório;
        dias [0][0] = 31;
        dias [0][1] = 28;
        dias [0][2] = 30;

        dias [1][0] = 31;
        dias [1][1] = 28;
        dias [1][2] = 30;

        for(int i= 0; i<dias.length; i++){
            for (int j=0;j< dias[i].length;j++ ){
                System.out.println(dias[i][j]);
            }
        }

        //-------------------------------------------------

        //Há a possibilidade de usar ForEach também ao invés de usar da forma acima;
        //A sintaxe para o ForEach em multidimensionais ficaria:
        System.out.println("-----------------------------");
        for (int [] arrBase: dias){
            for (int num: arrBase){
                System.out.println(num);
            }
        }

    }
}
