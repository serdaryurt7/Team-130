package day30_timeDate_varargs;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.TemporalUnit;

public class C01_LocalTime {

    public static void main(String[] args) {

        LocalTime saat = LocalTime.now();

        LocalTime saatUsa = LocalTime.now(ZoneId.of("America/New_York"));

        System.out.println("Newyork saati : " + saatUsa); // Newyork saati : 04:13:47.603692400

        System.out.println(saat.plusHours(10000)); // 03:16:05.212953300

        System.out.println(saat.minusHours(3).minusSeconds(23).minusMinutes(15)); // 08:01:41.403737200

        System.out.println(saat.withMinute(27).withSecond(15)); // 11:27:15.759377900

        System.out.println(saat.withSecond(0).withNano(0)); // 11:19

        System.out.println(saat.toNanoOfDay()); // 40776362541800
        // gece 00:00' dan başlayarak saatin oluşturulduğu ana kadar geçen nanosaniye

        LocalTime saat1 = LocalTime.of(10, 45);
        LocalTime saat2 = LocalTime.of(14, 12, 23);

        System.out.println(saat1.isBefore(saat2)); // true
        System.out.println(saat1.isAfter(saat2)); // false

    }


}
