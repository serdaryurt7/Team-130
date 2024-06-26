package dinamik_statik;

import java.util.Scanner;

public class GirilenSayiyaKadarOlanSayilardanAsalSayilariBulma {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sayac;

        System.out.println("Bir sayi giriniz: ");
        int sayi = scanner.nextInt();

        while (sayi >= 2) {

            sayac = 0;

            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    sayac++;
                }
            }

            if (sayac == 0) {

                System.out.println(sayi + " ");

            }
            sayi--;
        }
    }

}
