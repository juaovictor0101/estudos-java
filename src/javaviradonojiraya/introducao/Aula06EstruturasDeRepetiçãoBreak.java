package javaviradonojiraya.introducao;

public class Aula06EstruturasDeRepetiçãoBreak {
    public static void main(String[] args) {
        //Imprima um número até 25, dado um um valor, por exemplo, 50.

        int valorMax = 50;

        for (int i = 0; i <valorMax ; i++) {
            if(i>25){
                break;
            }
            System.out.println(i);
        }
    }
}
