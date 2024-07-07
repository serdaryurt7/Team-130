package day08_nestedIfElseStatements;

import java.util.Scanner;

public class C03_NestedIfElseIndirimliUrunSorusu2 {
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

        if (urunAdedi > 10) {
            // Urun miktari 10 dan çok olanlar
            if (kartVarMi == 'E') {
                indirimOrani = 20;
            } else if (kartVarMi == 'H') {
                indirimOrani = 15;
            } else {
                System.out.println("Kart bilgisi hatali");
            }

        } else if (urunAdedi > 0) {
            // Urun miktari 1-10(dahil) olanlar
            if (kartVarMi == 'E') {
                indirimOrani = 15;
            } else if (kartVarMi == 'H') {
                indirimOrani = 10;
            } else {
                System.out.println("Kart bilgisi hatali");
            }

        } else {
            // Urun miktari 0 veya negatif olanlar
            System.out.println("Urun miktari hatali");
        }

        System.out.println(indirimOrani + "indirimli toplam fiyat : " +
                urunAdedi * indirimsizFiyat * (100 - indirimOrani) / 100);
    }
}
