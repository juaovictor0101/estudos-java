package javaviradonojiraya.introducao;

public class Aula05EstruturasCondicionaisIF {
    public static void main(String[] args) {
        int idade = 17;
        boolean isAutorizadoComprarBebida = idade >=18;
        if(isAutorizadoComprarBebida){
            System.out.println("pode tomar todas, desce copao");
            //Uso padrão de IF
        }
        if(!isAutorizadoComprarBebida){
            System.out.println("foi brecado, ficou fudido dog");
            //Forma de usar negação (!) no IF, basicamento um se/senão improvisado.
        }


        int idade2 = 18;

        if (idade2>=19){
            System.out.println("Ta liberado usar bala e lança no rolê");
        }else{
            System.out.println("Vai ter que ficar só na agua, ficou fudido dog");
        }
    }
}
