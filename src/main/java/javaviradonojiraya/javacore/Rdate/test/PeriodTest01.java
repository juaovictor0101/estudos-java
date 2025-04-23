package javaviradonojiraya.javacore.Rdate.test;

import javaviradonojiraya.javacore.Gassossiacao.domain.Local;

import java.time.LocalDate;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest01 {
    public static void main(String[] args) {
        //Semelhante a duration, mas nesse caso é para datas, periodos de dias/meses/anos

        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2).plusDays(7);
        Period p1 = Period.between(now, nowAfterTwoYears);
        Period p2 = Period.ofDays(365);
        Period p3 = Period.ofWeeks(30);
        Period p4 = Period.ofMonths(12);
        Period p5 = Period.ofYears(3);



        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(Period.between(now, now.plusDays(p3.getDays())).getMonths()); //Gambiarra //
        // Caso queira pegar a quantidade de meses considerando os dias, não serria possível usando Period
        System.out.println(now.until(now.plusDays(p3.getDays()), ChronoUnit.MONTHS));

     }
}
