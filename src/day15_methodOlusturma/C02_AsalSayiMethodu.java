package day15_methodOlusturma;

import java.util.Scanner;

public class C02_AsalSayiMethodu {
    public static void main(String[] args) {

        // Soru 3- Kullanicidan main method icinde pozitif bir tamsayi alin.
        //         Girilen sayinin asal sayi olup olmadigini kontrol edip,
        //         sonuc olarak "asal sayi" veya "asal sayi degil" yazdiran bir method olusturun


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int sayi = scanner.nextInt();
        asalSayiMi(sayi);

    }

    public static void asalSayiMi(int sayi) {

        int flag = 61;

        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                flag++;
                break;

            }
        }

        if (flag == 61) {
            System.out.println("Verilen sayi asal");
        } else {
            System.out.println("Verilen sayi asal degil");
        }
    }
}
