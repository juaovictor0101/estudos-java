package javaviradonojiraya.javacore.Rdate.test;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class LocalDateTesr01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        System.out.println(Month.JANUARY.getValue());
        LocalDate date = LocalDate.of(2001,Month.JANUARY,19);
        //Local Date lida exclusivamente com datas, ignorando horários;

        LocalDate agora = LocalDate.now();
        agora = agora.plusWeeks(2);
        System.out.println(agora);


        //Metodos úteis
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.lengthOfMonth());
        System.out.println(date.isLeapYear());
        System.out.println(date);
        System.out.println(LocalDate.MAX);
        System.out.println(LocalDate.MIN);
    }
}
