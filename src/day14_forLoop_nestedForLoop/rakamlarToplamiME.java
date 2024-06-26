package day14_forLoop_nestedForLoop;

import java.util.Scanner;

public class rakamlarToplamiME {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int sayi = scanner.nextInt();

        // önce basamak sayısı lazım
        int basamakSayisi = (sayi + "").length();
        int birlerBasamagi = 0;
        int rakamlarToplami = 0;
        int girilenSayi = sayi;

        for (int i = 0; i < basamakSayisi; i++) {

            birlerBasamagi = girilenSayi % 10;
            rakamlarToplami += birlerBasamagi;
            girilenSayi /= 10;

        }

        System.out.println("Girilen " + sayi + " sayisinin rakamlar toplami : " + rakamlarToplami);

    }
}
