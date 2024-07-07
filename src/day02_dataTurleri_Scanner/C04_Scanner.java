package day02_dataTurleri_Scanner;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {

        // Kullanicidan ismini alip buyuk harf olarak yazdirin

        // 1.adim : scanner objesi olusturmak

        Scanner scanner = new Scanner(System.in);

        // 2.adim : kullanicidan istediginiz bilgiyi, kullaniciya bilgi olarak konsolda yazidirin

        System.out.println("Bir isim giriniz: ");

        // 3.adim : istediginiz bilgiye uygun bir variable olusturun,
        // scanner objesi ve uygun next() ile bilgiyi kullanicidan alip
        // olusturdugunuz variable'a atayin

        String girilenIsim = scanner.nextLine();
        // next sadece bir kelime alabilir, nextLine() butun girilen satiri alir

        System.out.println(girilenIsim.toUpperCase());


    }

}
