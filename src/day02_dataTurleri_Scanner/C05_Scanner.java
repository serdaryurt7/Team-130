package day02_dataTurleri_Scanner;

import java.util.Scanner;

public class C05_Scanner {

    public static void main(String[] args) {

        // Kullanicidan bir double bir de int sayi alip bunlarin toplamini ve carpimini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir tamsayi giriniz: ");
        int intSayi = scanner.nextInt();

        System.out.println("Bir double giriniz: ");
        double doubleSayi = scanner.nextDouble();

        System.out.println("Toplami: " + (intSayi + doubleSayi));
        System.out.println("Carpimi: " + (intSayi * doubleSayi));
    }
}
