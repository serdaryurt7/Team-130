package day17_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C03_NotOrtalamasiBulma {

    public static void main(String[] args) {

        // Bir ogretmenden not ortalamasi bulmak icin notlari alin
        // ögretmen islemi bitirmek için negatif bir sayı girmelidir.
        // Öğretmen negatif bir sayı girdiğinde, toplam kaç not girdiğini, not ortalamasının kaç olduğunu
        // ve en yüksek notu yazdırın.

        Scanner scanner = new Scanner(System.in);
        double not = 0;
        double toplam = 0;
        int sayac = 0;
        double enYuksekNot = 0;

        while (not >= 0) {

            System.out.println("Ortalama icin notlari giriniz, \nislemi bitirmek icin negatif bir sayi giriniz");
            not = scanner.nextDouble();

            if (not >= 0) {

                toplam += not;
                sayac++;

                // en yuksek not için her girilen notu, o andaki en yüksek not ile karşılaştıralım
                // ve girilen not, en yüksek nottan büyükse, onu en yüksek not olarak atayalım

                if (not > enYuksekNot) enYuksekNot = not;

            }

        }

        System.out.println("Not girilen ogrenci sayisi : " + sayac +
                "\nGirilen notlarin ortalamasi : " + toplam / sayac +
                "\nGirilen en yuksek not : " + enYuksekNot);


    }

}
