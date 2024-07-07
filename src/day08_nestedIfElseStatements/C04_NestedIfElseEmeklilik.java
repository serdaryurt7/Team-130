package day08_nestedIfElseStatements;

import java.util.Scanner;

public class C04_NestedIfElseEmeklilik {
    public static void main(String[] args) {

        // Soru 1- Kullanıcıdan cinsiyetini ve yaşını alın, Kadın 60 yaş ve üzeri, Erkek 65 yaş ve üzeri emekli olabilir.
        // Cinsiyet ve yaşını dikkate alarak "Emekli olabilirsin" veya "Emekli olmak icin .. yil daha calisman gerekir" yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen cinsiyetinizi giriniz E:Erkek , K:Kadin");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);
        System.out.println("Lutfen yasinizi giriniz");
        int yas = scanner.nextInt();

        // Ana degisken cinsiyet

        if (cinsiyet == 'K') {
            if (yas > 75 || yas < 15) {
                System.out.println("Bu yaslar icin emeklilik sorgumuz calismiyor");
            } else if (yas >= 60) {
                System.out.println("Kadin emekli olabilirsin");
            } else {
                System.out.println("Kadin emekli olmak icin " + (60 - yas) + " sene daha calismalidir");
            }

        } else if (cinsiyet == 'E') {
            if (yas > 80 || yas < 15) {
                System.out.println("Bu yaslar icin emeklilik sorgumuz calismiyor");
            } else if (yas >= 65) {
                System.out.println("Erkek emekli olabilirsin");
            } else {
                System.out.println("Erkek emekli olmak icin " + (65 - yas) + " sene daha calismalidir");
            }

        } else {
            System.out.println("Hatali cinsiyet bilgisi E veya K secilmeli");
        }
    }
}
