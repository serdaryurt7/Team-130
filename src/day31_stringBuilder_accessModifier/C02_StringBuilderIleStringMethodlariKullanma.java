package day31_stringBuilder_accessModifier;

public class C02_StringBuilderIleStringMethodlariKullanma {

    public static void main(String[] args) {

        /*
            StringBuilder ile kullanılabilen method'lardan
            String, char gibi başka data türünden sonuç döndürenler
            StringBuilder'i kalici olarak değiştirmezler
         */


        StringBuilder sb = new StringBuilder("Java candir");

        // sb'yi büyük harflerle yazdırın

        System.out.println(sb.toString().toUpperCase()); // JAVA CANDİR

        // StringBuilder'da olmayan String özelliklerini kullanmak istersek, önce toString() ile String'e çevirir, sonra istediğimiz String method'unu kullanabiliriz
        // Peki bu değişiklik kalıcı oldu mu ?

        System.out.println(sb); //  Java candir

        // Peki atama yapsak kalici olur mu ?

        // sb = sb.toString().toUpperCase();
        // farklı data türündeki non-primitive variable'lar birbirine atanamaz veya birbiriyle karşılaştırılamaz

        StringBuilder sb1 = new StringBuilder("Java");

        // eğer sb'nin değerini büyük harf yapıp, kalıcı olarak değiştirmek istiyorsak

        sb = new StringBuilder(sb.toString().toUpperCase());

        System.out.println(sb); // JAVA CANDİR

        System.out.println(sb.substring(5)); // CANDİR return type String

        System.out.println(sb); // JAVA CANDİR

        System.out.println(sb.charAt(6)); // A return type char

        System.out.println(sb); // JAVA CANDİR



    }

}
