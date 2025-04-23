package javaviradonojiraya.javacore.Rdate.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime dataEHora = LocalDateTime.now();
        LocalDate data = LocalDate.of(2001, Month.MARCH, 19);
        LocalTime hora = LocalTime.of(9,24,59);
        System.out.println(dataEHora);
        System.out.println(data);

        System.out.println("-------------------------------------");
        LocalDate data1 = LocalDate.parse("2001-03-19");
        LocalTime hora1 = LocalTime.parse("21:24:59");
        System.out.println(data1);
        System.out.println(hora1);

        System.out.println("----------------------------------------");
        LocalDateTime ltdt1 = data.atTime(hora); //adcionando uma hora numa data
        LocalDateTime ltdt2 = hora.atDate(data); //adicionando uma data numa hora
    }
}
