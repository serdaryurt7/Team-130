package day07_ifElseStatements;

import java.util.Scanner;

public class C03_NotYazdirma {
    public static void main(String[] args) {

        // kullanicidan 100 uzerinden notunu alın
        // negatif veya 100 den buyuk deger girerse "Gecersiz Not",
        // 85 ile 100 arasında ise (sinirlar dahil) AA
        // 65(dahil) buyuk ve 85 ten kucuk ise BB
        // 50(dahil) buyuk ve 65 ten kucuk ise CC
        // 50 den kucuk ise DD Kaldin yazdirin.

        /*

        if
        else if
        else if
        ...
        else
        seklinde yazilan kod için

        - sonu else ise bittiğinden bir sonuç yazdırmama ihtimali YOKTUR.

        - else if ... ile butun if'ler birbirine baglandigindan aynı anda iki if body'sinin devreye girme ihtimali de YOKTUR

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Notunuzu giriniz");
        double girilenNot = scanner.nextDouble();

        if (girilenNot<0 || girilenNot > 100){
            System.out.println("Gecersiz Not");
        }else if (girilenNot>=85){
            System.out.println("AA");
        }else if (girilenNot>=65){
            System.out.println("BB");
        }else if (girilenNot>=50){
            System.out.println("AA");
        }else {
            System.out.println("DD Kaldin");
        }
    }
}
