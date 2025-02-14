package javaviradonojiraya.javacore.Rdate.test;

import javaviradonojiraya.javacore.Gassossiacao.domain.Local;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneIDTest01 {
    public static void main(String[] args) {
        //Zonas que o Java oferece suporte
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault()); //verificando zona do sistema

        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        System.out.println(tokyoZone);
        LocalDate now = LocalDate.now();
        System.out.println(now);

        ZonedDateTime zonedDateTime = now.atStartOfDay().atZone(tokyoZone);
        System.out.println(zonedDateTime);

        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);

        nowInstant.atZone(tokyoZone);
        ZonedDateTime zonedDateTime1 = now.atStartOfDay().atZone(tokyoZone);
        System.out.println(zonedDateTime1);

        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        ZoneOffset offSetManaus = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime1 = now.atStartOfDay().atOffset(offSetManaus);
        System.out.println(offsetDateTime1);

        OffsetDateTime offsetDateTime2 = OffsetDateTime.of(now.atStartOfDay(), offSetManaus);
        System.out.println(offsetDateTime2);

        OffsetDateTime offsetDateTime3 =nowInstant.atOffset(offSetManaus);
        System.out.println(offsetDateTime3);

        JapaneseDate  japaneseDate = JapaneseDate.from(LocalDate.now());
        System.out.println(japaneseDate);

        LocalDate meijiEraLocalDate = LocalDate.of(1900, 2,1);
        JapaneseDate  meijiEra = JapaneseDate.from(meijiEraLocalDate);
        System.out.println(meijiEra);


    }
}
