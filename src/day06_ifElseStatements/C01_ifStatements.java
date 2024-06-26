package day06_ifElseStatements;

import java.util.Scanner;

public class C01_ifStatements {

    public static void main(String[] args) {

        /*
        bagimsiz if cumleleri, kodun geriye kalani ile ilgilenmez,
        SADECE if parantezindeki şarta odaklanır
        Boolean şart => true ise if body'si çalışır
        Boolean şart => false ise if body'si çalışmaz

        birden fazla bagimsiz if cumlesi kullanildiginda
        girilen degere bagli olarak
        tum if body'leri devreye girebilecegi gibi
        hicbir if body'si devreye girmeyebilir de
        */

        // kullanicidan iki deger alin
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen iki tamsayi giriniz");

        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        // 1.sayi 2.sayidan buyukse aferin yazdirin

        if (sayi1 > sayi2) {
            System.out.println("Aferin");
        }

        // 1.sayi cift ise cift sayilari severim yazdirin

        if (sayi1 % 2 == 0) {
            System.out.println("Cift sayilari severim");
        }

        // 2.sayi 50 den buyukse buyuk sayilarla isim olmaz yazdir

        if (sayi2 > 50) {
            System.out.println("Buyuk sayilarla isim olmaz");
        }

        // toplamlari 100 den kucukse ufak sayilarla isim olmaz yazdirin.

        if (sayi1 + sayi2 < 100) {
            System.out.println("Ufak sayilarla isim olmaz");
        }
    }

}
