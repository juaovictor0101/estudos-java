package javaviradonojiraya.introducao;

public class Aula05EstruturasCondicionaisSwitchCase {
    public static void main(String[] args) {
        byte dia = 7;

        //Em switch case no java se pode usar apenas as variaveis:
        //char, int, byte, short, enum e String

        switch (dia){
            case 1:
                System.out.println("Dom");
                break;
            case 2:
                System.out.println("Seg");
                break;
            case 3:
                System.out.println("Ter");
                break;
            case 4:
                System.out.println("Qua");
                break;
            case 5:
                System.out.println("Qui");
                break;
            case 6:
                System.out.println("Sex");
                break;
            case 7:
                System.out.println("Sáb");
                break;
            default:
                System.out.println("Informe um número entre 1 e 7");



        }
    }
}
