package day16_methodOlusturma_methodOverloading;

public class C02_returnTypeileMethodOlusturma {
    public static void main(String[] args) {

        // Verilen isim ve soyismi
        // istenen formata çevirip bize döndüren bir method oluşturun
        // ornek output : A**** B**********

        System.out.println(ismiIstenenFormataCevir("Betul", "Yurtseven"));

    }

    public static String ismiIstenenFormataCevir(String isim, String soyisim) {

        String donusmusIsim = isim.substring(0, 1).toUpperCase() + isim.substring(1).replaceAll("\\w", "*") +
                " " + soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).replaceAll("\\w", "*");

        return donusmusIsim;
    }
}
