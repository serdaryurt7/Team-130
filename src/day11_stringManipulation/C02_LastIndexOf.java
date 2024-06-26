package day11_stringManipulation;

public class C02_LastIndexOf {
    public static void main(String[] args) {
        String str = "Bu Java ogrenilecek";

        // e'nin ilk kullaniminin index'ini yazdırın

        System.out.println(str.indexOf('e')); // 11

        // e'nin son kullanımının index'ini yazdırın

        System.out.println(str.lastIndexOf("e")); // 17

        //u' nun ilk kullanım ve son kullanım indexlerini yazdırın

        System.out.println("ilk index : " + str.indexOf("u"));

        System.out.println("son index : " + str.lastIndexOf("u"));

        // J harfinin bu metin' de hiç kullanılmadığını veya sadece bir kere kullanıldığını yazdırın.

        if (str.indexOf('J') == -1) {
            System.out.println("Metinde hic J yok");
        } else if (str.indexOf('J') == str.lastIndexOf('J')) {
            System.out.println("Metinde J sadece bir kere kullanilmis");
        }

        // Bu Java ogrenilecek

        // indexOf --> baştan sonra doğru gider
        // lastIndexOf --> Sondan başa doğru gider

        System.out.println(str.lastIndexOf("e", 15)); // 15
        System.out.println(str.lastIndexOf("e", 14)); // 11

        System.out.println(str.lastIndexOf("x")); // -1
    }
}
