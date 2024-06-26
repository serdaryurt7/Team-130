package day09_switchStatements;

import java.util.Scanner;

public class C04_ikiBasamakliSayiYazdirma {
    public static void main(String[] args) {

        // Soru 2- Kullanıcıdan 2 basamaklı bir sayı alıp,
        //         girilen sayıyı yazı ile yazdırın

        // 34 ==> otuz, 4 dort

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen iki basamakli bir sayi giriniz");
        int girilenSayi = scanner.nextInt();
        int birlerBasamagi = girilenSayi % 10;
        int onlarBasamagi = girilenSayi / 10;

        switch (onlarBasamagi) {
            case 1:
                System.out.print("On");
                break;
            case 2:
                System.out.print("Yirmi");
                break;
            case 3:
                System.out.print("Otuz");
                break;
            case 4:
                System.out.print("Kirk");
                break;
            case 5:
                System.out.print("Elli");
                break;
            case 6:
                System.out.print("Altmis");
                break;
            case 7:
                System.out.print("Yetmis");
                break;
            case 8:
                System.out.print("Seksen");
                break;
            case 9:
                System.out.print("Doksan");
                break;
        }

        switch (birlerBasamagi) {
            case 0:
                break;
            case 1:
                System.out.println("bir");
                break;
            case 2:
                System.out.println("iki");
                break;
            case 3:
                System.out.println("uc");
                break;
            case 4:
                System.out.println("dort");
                break;
            case 5:
                System.out.println("bes");
                break;
            case 6:
                System.out.println("alti");
                break;
            case 7:
                System.out.println("yedi");
                break;
            case 8:
                System.out.println("sekiz");
                break;
            case 9:
                System.out.println("dokuz");
                break;
        }

    }
}
