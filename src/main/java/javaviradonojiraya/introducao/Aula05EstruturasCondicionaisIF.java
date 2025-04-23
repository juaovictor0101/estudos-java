package javaviradonojiraya.introducao;

public class Aula05EstruturasCondicionaisIF {
    public static void main(String[] args) {
        int idade = 17;
        boolean isAutorizadoComprarBebida = idade >=18;
        if(isAutorizadoComprarBebida){
            System.out.println("pode tomar todas");
            //Uso padrão de IF
        }
        if(!isAutorizadoComprarBebida){
            System.out.println("foi brecado");
            //Forma de usar negação (!) no IF, basicamento um se/senão improvisado.
        }


        int idade2 = 18;

        if (idade2>=19){
            System.out.println("Pode beber");
        }else{
            System.out.println("Vai ter que ficar só na agua meu mano ");
        }
    }
}
