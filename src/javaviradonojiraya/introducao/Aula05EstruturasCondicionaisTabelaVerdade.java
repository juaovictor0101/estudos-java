package javaviradonojiraya.introducao;

public class Aula05EstruturasCondicionaisTabelaVerdade {
    public static void main(String[] args) {
        double salarioAnual = 25000;
        double imposto;

        if (salarioAnual<=34.712){
            imposto= salarioAnual* (9.70/100);
        }else if( salarioAnual >= 34.713 && salarioAnual <= 68.587){
            imposto= salarioAnual* (37.35/100);
        }else{
            imposto= salarioAnual* (49.50/100);
        }
        System.out.println(imposto);
    }
}
