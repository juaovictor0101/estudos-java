package javaviradonojiraya.javacore.Rdate.test;

import java.time.LocalTime;
import java.util.Locale;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime hora = LocalTime.of(23,59,59);
        LocalTime horaAgora = LocalTime.now();

        System.out.println(hora);
        System.out.println(horaAgora);
        System.out.println(hora.getHour());
        System.out.println(hora.getMinute());
        System.out.println(hora.getSecond());
        System.out.println(hora.getNano());
        System.out.println(hora.getHour());
        System.out.println(LocalTime.MAX);
        System.out.println(LocalTime.MIN);
    }
}
