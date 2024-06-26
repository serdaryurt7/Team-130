package day30_timeDate_varargs;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class C02_LocalDateTime {

    public static void main(String[] args) {

        LocalDateTime tarihSaat = LocalDateTime.now();

        System.out.println(tarihSaat); // 2024-05-24T11:33:08.156551900

        /*
            LocalDateTime objesi hem tarihi, hem de zamanı bize getirir
            ANCAK tarih ve zamanı bizim istediğimiz formatta yazdırmaz
            EGER tarih ve/veya zamanı istediğiniz bir formatta yazdırmak isteseniz
            DateTimeFormatter class'indan yardım almalısınız
            03-12-2023
            3- Aralik- 2023
            5- Mar-23
            17/03/2023
         */

        DateTimeFormatter istedigimFormat1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println(tarihSaat.format(istedigimFormat1)); // 24-05-2024

        // 15 Mart 23 Pazartesi 05 : 12 PM

        DateTimeFormatter istedigimFormat2 = DateTimeFormatter.ofPattern("dd MMMM yy EEEE hh : mm a");

        System.out.println(tarihSaat.format(istedigimFormat2)); // 24 Mayıs 24 Cuma 11 : 47 AM

        DateTimeFormatter istedigimFormat3 = DateTimeFormatter.ofPattern("MM/dd/yyyy h:mm");

        System.out.println(tarihSaat.format(istedigimFormat3)); // 05/24/2024 11:59


    }
}
