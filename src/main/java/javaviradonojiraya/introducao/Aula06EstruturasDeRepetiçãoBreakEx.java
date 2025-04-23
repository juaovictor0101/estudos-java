package javaviradonojiraya.introducao;

public class Aula06EstruturasDeRepetiçãoBreakEx {
    public static void main(String[] args) {
        //Dado o valor de um carro, descubra em quantas parcelas ele pode ser parcelado;
        //Condição: Valor da parcela >=1000

        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal/parcela;
            if (valorParcela < 1000){
                break;
            }
            System.out.println ("Parcelado em: " + parcela + " R$ " + valorParcela);
        }
    }
}
