package day15_methodOlusturma;

import java.util.Scanner;

public class C03_TamBolenlerSayisi {
    public static void main(String[] args) {

        // Soru 4- Kullanicidan main method içinde bir tamsayı alın.
        //         Girilen sayinin pozitif tam bölenleri sayısını bulup bize döndüren methodu oluşturun.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int sayi = scanner.nextInt();

        System.out.println(pozitifTamBolenSayisi(sayi));

    }

    public static int pozitifTamBolenSayisi(int sayi) {

        // 20 ==> 1,2,4,5,10,20  20 sayısının 6 tane pozitif tam böleni bulunmakta

        int sayac = 0;

        for (int i = 1; i <= sayi; i++) {

            if (sayi % i == 0) {
                sayac++;
            }
        }

        return sayac;

    }

}
