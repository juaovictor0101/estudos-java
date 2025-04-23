package javaviradonojiraya.introducao;

public class Aula07ArraysMultidimensionaisOutrasInicializacoes {
    public static void main(String[] args) {

        int array[] = {1,2,3,4};


        int [][] arrayInt= new int[3][];
        //após aberto um array multidensional, as declração particulares, após a base, pode ser feitas da forma que o usuário quiser, conforme código abaixo que usa 3 formas diferntes de declarar cada array;

        arrayInt [0]= new int[2];
        arrayInt [1]= new int[] {1,2,3};
        arrayInt [2]= array;

        int [][] arrayInt2= {{0,0}, {1,2,3}, {1,2,3,4}}; //essa é outra forma de declarar um array multidimensonal, com a separação de cada nova array e seu elemtento, fazendo o programa ler e entender que nesse que caso seria uma array [3], onde [3] [0] = 2; [3][1]= 1,2,3 e [3][2]= 1,2,3,4;

        for (int[] arrayBase: arrayInt2){
            System.out.println("\n-----");
            for(int num:arrayBase){
                System.out.print(num + "  ");
            }
        }
     }
}
