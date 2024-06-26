package day07_ifElseStatements;

import java.util.Scanner;

public class C07_Emeklilik {

    public static void main(String[] args) {

        // Soru 1- Kullanıcıdan cinsiyetini ve yaşını alın, Kadın 60 yaş ve üzeri, Erkek 65 yaş ve üzeri emekli olabilir.
        // Cinsiyet ve yaşını dikkate alarak "Emekli olabilirsin" veya "Emekli olmak için .. yil daha calisman gerekir" yazdırın.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz E:Erkek, K:Kadin");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);
        System.out.println("Lutfen yasinizi giriniz");
        int yas = scanner.nextInt();

        if (cinsiyet == 'E' && yas >= 65) {
            System.out.println("65 yas uzeri erkek emekli olabilir");
        } else if (cinsiyet == 'E' && yas < 65) {
            System.out.println("Emekli olmak için " + (65 - yas) + " yil daha calisman gerekir");
        } else if (cinsiyet == 'K' && yas >= 60) {
            System.out.println("60 yas uzeri kadin emekli olabilir");
        } else if (cinsiyet == 'K' && yas < 60) {
            System.out.println("Emekli olmak için " + (60 - yas) + " yil daha calisman gerekir");
        } else {
            System.out.println("Hatali giris yapildi");
        }
    }

}
