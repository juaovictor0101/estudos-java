package javaviradonojiraya.introducao;

public class Aula05EstruturasCondicionaisSwitchCaseEx {
    public static void main(String[] args) {
        //Ultilizando switch e dado os valores de 1 a 7, imprima se é um dia útil ou final de semana.
        //Considerando 1 como domingo

        byte dia = 7;
                switch (dia){
                    case 1:
                        System.out.println("Final de semana!!");
                        break;
                    case 2:
                        System.out.println("Dia de começar a dieta ");
                        break;
                    case 3:
                        System.out.println("Dia útil");
                        break;
                    case 4:
                        System.out.println("Dia útil");
                        break;
                    case 5:
                        System.out.println("Dia útil");
                        break;
                    case 6:
                        System.out.println("sextouuuu");
                        break;
                    case 7:
                        System.out.println("Começou o FDS!!!!");
                        break;
                    default:
                        System.out.println("Informe um número entre 1 e 7 para uma consulta válida.");
                }
    }
}
