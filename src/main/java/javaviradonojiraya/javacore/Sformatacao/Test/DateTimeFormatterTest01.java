package javaviradonojiraya.javacore.Sformatacao.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        LocalDate parse1 = LocalDate.parse("20250214", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2025-02-14", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2025-02-14", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);
        LocalDateTime parse4 = LocalDateTime.parse("2025-02-14T11:21:46.7679034");
        System.out.println(parse4);

        // dd/MM/yyyy
        // MM//dd//yyyy
        // yyyy/MM/dd

        DateTimeFormatter formatterBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBr = LocalDate.now().format(formatterBr);
        System.out.println(formatBr);
        LocalDate parseBr = LocalDate.parse("14/02/2025", formatterBr);
        System.out.println(parseBr);

        DateTimeFormatter formatterIt = DateTimeFormatter.ofPattern("dd/MMMM/yyyy", Locale.ITALY);
        String formatIT = LocalDate.now().format(formatterIt);
        System.out.println(formatIT);

        LocalDate parseIt = LocalDate.parse("14/febbraio/2025", formatterIt);
        System.out.println(parseIt);

    }
}
