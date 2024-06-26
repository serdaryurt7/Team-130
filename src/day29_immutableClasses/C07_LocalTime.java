package day29_immutableClasses;

import java.time.LocalDate;
import java.time.LocalTime;

public class C07_LocalTime {

    public static void main(String[] args) {

        LocalTime saat = LocalTime.now(); // oluşturulduğu andaki süreyi alır

        System.out.println(saat); // 18:27:18.529846400

        // bir for loop ile 1 milyon işlem yaptırıp süreyi hesaplayalım

        LocalTime baslangic = LocalTime.now();
        long nanoBaslangic = baslangic.toNanoOfDay();

        int toplam = 0;

        for (int i = 1; i < 10000; i++) {
            toplam = 0;
            for (int j = 0; j <= 1000000; j++) {

                toplam += i % 10;
            }

        }


        System.out.println(toplam);
        LocalTime bitis = LocalTime.now();

        long nanoBitis = bitis.toNanoOfDay();

        System.out.println(nanoBaslangic);
        System.out.println(nanoBitis);
        System.out.println("Islem suresi = " + (nanoBitis - nanoBaslangic));

    }

}
