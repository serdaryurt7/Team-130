package day17_whileLoop_doWhileLoop;

import java.util.Scanner;

public class KullanicidanBelirsizSayidaSayilariToplama {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double girilenSayi = 0;
        double toplamSayi = 0;
        int sayac = 0;

        while (toplamSayi <= 1000) {

            System.out.println("Lutfen toplanmasi icin sayi giriniz:");
            girilenSayi = scanner.nextDouble();

            sayac++;

            toplamSayi += girilenSayi;

        }

        System.out.println(sayac + " adet sayi girildi ve toplami : " + toplamSayi);


    }

}
