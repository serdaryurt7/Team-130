package day08_nestedIfElseStatements;

import java.util.Scanner;

public class C02_NestedIfElseIndirimliUrunSorusu {
    public static void main(String[] args) {

        // Soru 3- Kullanicidan aldığı ürün adedini ve indirimsiz fiyatını alın, kullanıcıya müşteri kartı olup olmadığını sorun
        // Müşteri kartı varsa ve 10 üründen fazla alırsa %20, 10 üründen az alırsa %15 indirim yapın,
        // Müşteri kartı yoksa ve 10 üründen fazla alırsa %15, 10 üründen az alırsa %10 indirim yapın,

        Scanner scanner = new Scanner(System.in);
        System.out.println("Satin aldiginiz urun adedi: ");
        int urunAdedi = scanner.nextInt();

        System.out.println("Aldiginiz urunun indirimsiz fiyatini giriniz: ");
        double indirimsizFiyat = scanner.nextDouble();

        System.out.println("Musteri kartiniz var mi ? E:evet , H:hayir");
        char kartVarMi = scanner.next().toUpperCase().charAt(0);

        int indirimOrani = 0;


        /*
             if else ile soru çözerken, degişken sayisi 1' den fazla ise iç içe if else cümleleri kurabiliriz

             Önce değişkenlerden birini asıl değişken seçip, yapıyı ona göre kuralım

             bu class'da müşteri kartı asıl değişken olsun

             kart bilgisine göre 3 ihtimali yazdıktan sonra her ihtimalin içine bu defa ürün miktarına göre if else yazalım
         */

        if (kartVarMi == 'E') {
            // buraya gelen müşterinin kartı var
            if (urunAdedi > 10) {
                indirimOrani = 20;

            } else if (urunAdedi > 0) {
                indirimOrani = 15;
            } else {
                System.out.println("Urun miktari hatali");
            }

        } else if (kartVarMi == 'H') {
            // buraya gelen müşterinin kartı yok
            if (urunAdedi > 10) {
                indirimOrani = 15;

            } else if (urunAdedi > 0) {
                indirimOrani = 10;
            } else {
                System.out.println("Urun miktari hatali");
            }
        } else {
            System.out.println("Kart bilgisi hatali");
        }

        if (indirimOrani > 0) {
            System.out.println(indirimOrani + "indirimli toplam fiyat : " + indirimsizFiyat * urunAdedi * (100 - indirimOrani) / 100);
        }

    }
}
