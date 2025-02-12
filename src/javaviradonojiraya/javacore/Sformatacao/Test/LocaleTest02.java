package javaviradonojiraya.javacore.Sformatacao.Test;

import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguage = Locale.getISOLanguages();

        System.out.println("Linguas suportadas pela JVM: ");
        for (String s : isoLanguage) {
            System.out.print( s + " ");
        }

        System.out.println();
        System.out.println("Países suportados pela JVM: ");
        for (String isoCountry : isoCountries) {
            System.out.print(isoCountry + " ");
        }


    }
}
