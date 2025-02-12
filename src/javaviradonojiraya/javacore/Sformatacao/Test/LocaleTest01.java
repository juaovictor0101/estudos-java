package javaviradonojiraya.javacore.Sformatacao.Test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        //Usando 'Locale' para internacionalizar datas em Java
        Locale localeItaly = new Locale("it", "IT");
        Locale localeCH = new Locale("it", "CH");
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeHolanda = new Locale("nl", "NL");
        Locale localeBrasil = new Locale("pt", "BR");
        Locale localeJapao = new Locale("ja", "JP");

        Calendar calendar = Calendar.getInstance();

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeHolanda);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeBrasil);
        DateFormat df6 = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);

        System.out.println("Data no formato da Itália: "+ df1.format(calendar.getTime()));
        System.out.println("Data no formato da Suiça: "+ df1.format(calendar.getTime()));
        System.out.println("Data no formato da india: "+ df3.format(calendar.getTime()));
        System.out.println("Data no formato da Holanda: "+ df4.format(calendar.getTime()));
        System.out.println("Data no formato do Brasil: "+ df5.format(calendar.getTime()));
        System.out.println("Data no formato do Japão: " + df6.format(calendar.getTime()));


        //configurando como sairia Brasil escrito na linguagem natida de cada um dos paises a direita informados
        System.out.println("--------------------------------------------");
        System.out.println(localeBrasil.getDisplayCountry(localeItaly));
        System.out.println(localeBrasil.getDisplayCountry(localeIndia));
        System.out.println(localeBrasil.getDisplayCountry(localeHolanda));
        System.out.println(localeBrasil.getDisplayCountry(localeJapao));
    }
}
