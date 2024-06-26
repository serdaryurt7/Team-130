package day17_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C02_KullanicidanAlinanSayilariToplama {
    public static void main(String[] args) {

        // Kullanıcıdan toplanmak üzere sayılar alın
        // toplam 500'ü geçerse "Bu kadar sayi yeter, ... adet sayi girdiniz ve toplami ... oldu" yazdırın

        Scanner scanner = new Scanner(System.in);

        double sayi = 0;
        double toplam = 0;
        int sayac = 0;

        while (toplam<= 500){

            System.out.println("Lutfen toplanmak uzere sayi giriniz");
            sayi = scanner.nextDouble();

            sayac ++;
            toplam += sayi;

        }

        System.out.println("Bu kadar sayi yeter, " + sayac + " adet sayi girdiniz ve toplami " + toplam );

    }
}
