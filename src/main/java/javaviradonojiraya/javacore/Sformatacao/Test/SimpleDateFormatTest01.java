package javaviradonojiraya.javacore.Sformatacao.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String patter = "'Brasil' dd 'de' MMMM 'de' yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(patter);
        System.out.println(sdf.format(new Date()));

        //lembrar de olhar documentação do Java ao usar essa formatação, tem tudo explicado por lá

    }
}
