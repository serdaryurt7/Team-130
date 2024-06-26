package day06_ifElseStatements;

import java.util.Scanner;

public class C02_ifStatements {

    public static void main(String[] args) {

        // kullanicidan iki sayi alin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Iki sayi giriniz");

        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        // ilk sayi 2.ciden buyukse "buyuksun sayi1" yazdirin

        boolean sonuc = sayi1 > sayi2;

        if (sonuc) {
            System.out.println("buyuksun sayi1");
        }

        // ikinci sayi sifirdan buyukse "buyuksun sayi2" yazdirin

        sonuc = sayi2 > 0;

        if (sonuc) {
            System.out.println("buyuksun sayi2");
        }

        // iki sayinin toplami 100 den buyukse "ikinizde buyuksunuz" yazdirin

        sonuc = sayi1 + sayi2 > 100;
        if (sonuc){
            System.out.println("ikinizde buyuksunuz");
        }

    }

}
