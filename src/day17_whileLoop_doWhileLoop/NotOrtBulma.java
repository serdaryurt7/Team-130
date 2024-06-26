package day17_whileLoop_doWhileLoop;

import java.util.Scanner;

public class NotOrtBulma {
    public static void main(String[] args) {

        // Bir ogretmenden not ortalamasi bulmak icin notlari alin
        // ögretmen islemi bitirmek için negatif bir sayı girmelidir.
        // Öğretmen negatif bir sayı girdiğinde, toplam kaç not girdiğini, not ortalamasının kaç olduğunu
        // ve en yüksek notu yazdırın.


        double girilenNot = 0;
        int sayac = 0;
        double toplam = 0;
        double enYuksekNot = 0;

        Scanner scanner = new Scanner(System.in);


        while (girilenNot >= 0) {

            System.out.println("Ortalama icin notlari giriniz, \nislemi bitirmek icin negatif bir sayi giriniz");
            girilenNot = scanner.nextDouble();

            if (girilenNot >= 0) {

                sayac++;
                toplam += girilenNot;

                if (girilenNot > enYuksekNot) {
                    enYuksekNot = girilenNot;
                }

            }

        }

        System.out.println("Not girilen ogrenci sayisi : " + sayac);
        System.out.println("Ortalama : " + toplam / sayac);
        System.out.println("En yuksek not : " + enYuksekNot);

    }
}
