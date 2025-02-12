package javaviradonojiraya.javacore.Rdate.test;

import java.util.Calendar;
import java.util.Date;
import java.util.spi.CalendarNameProvider;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c); //Data sem nenhuma formatação
        System.out.println("----------------------------------------");
        Date date = c.getTime();
        System.out.println(date); //Data formatada
        //Usos úteis de metodos da classe Calendar

       //Metodo para verificar se o primeiro dia da semana é domingo
         if (c.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Dogindo é o primeiro dia da semana");
        }
        System.out.println("----------------------------------------");
        System.out.println(c.get(Calendar.DAY_OF_WEEK)); //Vê qual é o dia da semana e retorna um inteiro
        System.out.println(c.get(Calendar.DAY_OF_MONTH)); //Vê qual o dia do mês e retorna um inteiro
        System.out.println(c.get(Calendar.DAY_OF_YEAR)); //Vê qual o dia do ano e retorna um inteiro
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH)); //Vê qual o dia do mês na semana, nesse caso a segunda terça-feira de fevereiro

        System.out.println("----------------------------------------");
        c.add(Calendar.DAY_OF_MONTH, 5); //Adiciona dias na data atual do sistema
        c.add(Calendar.HOUR, 10); //Adciona horas na data atual do sistema, e caso passe de 24 horas, muda o dia/mês/ano
        c.roll(Calendar.HOUR,24); //Adiciona horas,e  caso passe das 24 horas do dia, ele começa a contar do 0 no mesmo dia
        System.out.println(date);

    }
}
