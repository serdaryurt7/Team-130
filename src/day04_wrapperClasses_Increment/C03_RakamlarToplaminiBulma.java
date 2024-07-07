package day04_wrapperClasses_Increment;

import java.util.Scanner;

public class C03_RakamlarToplaminiBulma {

    public static void main(String[] args) {

        // Kullanicidan 3 basamakli bir sayi alip, sayinin rakamlar toplamini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 3 basamakli pozitif bir sayi giriniz");
        int girilenSayi = scanner.nextInt();

        // diyelim ki kullanici 375 sayisini girdi
        // bize birler basamagini ve rakamlar toplamini kaydedecegimiz 2 variable lazim

        int birlerBasamagi = 0;
        int rakamlarToplami = 0;

        birlerBasamagi = girilenSayi % 10;
        rakamlarToplami += birlerBasamagi;

        // 5 i rakamlar toplamina ekledik
        // 5'ten kurtulalim

        girilenSayi = girilenSayi / 10;

        birlerBasamagi = girilenSayi % 10;
        rakamlarToplami += birlerBasamagi;

        girilenSayi = girilenSayi / 10;

        rakamlarToplami += girilenSayi;

        System.out.println("Girilen sayinin rakamlar toplami : " + rakamlarToplami);





    }
}
