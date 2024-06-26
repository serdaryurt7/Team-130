package day14_forLoop_nestedForLoop;

import java.util.Scanner;

public class C01_RakamlarToplami {
    public static void main(String[] args) {

        // Kullanıcıdan pozitif bir tamsayı alıp, rakamlar toplamını yazdırın.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int sayi = scanner.nextInt();

        // önce bana basamak sayısı lazım
        int basamakSayisi = (sayi + "").length();
        int birlerBasamagi = 0;
        int rakamlarToplami = 0;
        int girilenSayi = sayi;

        for (int i = 0; i < basamakSayisi; i++) {

            birlerBasamagi = girilenSayi % 10;
            rakamlarToplami = rakamlarToplami + birlerBasamagi;
            girilenSayi = girilenSayi / 10;

        }

        System.out.println("Girilen" + sayi + "sayisinin rakamlar toplami : " + rakamlarToplami);


    }
}
