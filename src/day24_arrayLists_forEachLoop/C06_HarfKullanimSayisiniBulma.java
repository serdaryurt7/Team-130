package day24_arrayLists_forEachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class C06_HarfKullanimSayisiniBulma {

    public static void main(String[] args) {

        // Soru 4- Kullanıcıdan bir cümle ve bir harf alın, case sensitive olmadan
        // harf cümlede kullanılmışsa kaç kere kullanıldığını yazdırın,
        // kullanılmadıysa "harf cumlede kullanilmamis" yazdırın.


        String cumle = "";
        String harf = "";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir cumle giriniz");
        cumle = scanner.nextLine();

        System.out.println("Aranacak harfi giriniz");
        harf = scanner.next().substring(0, 1);

        /*
            Cümledeki her bir harfe iki türlü ulaşabiliriz
            1- for-loop ve substring ile
            2- split ile array'e çevirip, for-each loop ile
         */

        String[] cumleHarfArrayi = cumle.split(""); // [S, e, r, d, a, r,  , Y, u, r, t, s, e, v, e, n]

        int sayac = 0;

        for (String each : cumleHarfArrayi
        ) {

            if (each.equalsIgnoreCase(harf)) {

                sayac++;
            }
        }

        if (sayac == 0) {
            System.out.println("harf cumlede kullanilmamis");
        } else {

            System.out.println("Verilen harf cumlede " + sayac + " kere kullanilmis");
        }


    }

}
