package day31_stringBuilder_accessModifier;

public class C03_Equals_CompareTo {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");
        String str = "Java";
        StringBuilder sb1 = new StringBuilder(str);

        // System.out.println(sb == str ); farklı data türündeki non - primitive'ler == ile karşılaştırılamaz

        System.out.println(sb == sb1); // false
        System.out.println(sb == sb); // true
        //  == ile sb'ların karşılaştırılmasına itiraz etmez ama kendisi ile karşılaştırılması hariç, sonuç hep false olur

        System.out.println(sb.equals(str)); // false
        System.out.println(sb.equals(sb1)); // false
        System.out.println(sb.equals(sb)); // true
        // equals ile String veya StringBuilder'lar ile karşılaştırılmasına itiraz etmez
        // ama kendisi ile karşılaştırılması hariç, sonuç hep false olur

        // StringBuilder'ların aynı metne sahip olup olmadığını öğrenmek için compareTo kullanılır

        StringBuilder sb2 = new StringBuilder("Hava");
        StringBuilder sb3 = new StringBuilder("Tava");
        StringBuilder sb4 = new StringBuilder("Jale");
        StringBuilder sb5 = new StringBuilder("Jandarma");

        System.out.println(sb.compareTo(sb1)); // Java => Java sonuc 0
        System.out.println(sb.compareTo(sb2)); // Java => Hava sonuc 2
        System.out.println(sb.compareTo(sb3)); // Java => Tava sonuc -10
        System.out.println(sb.compareTo(sb4)); // Java => Jale sonuc 10
        System.out.println(sb.compareTo(sb5)); // Java => Jandarma sonuc 8

        /*
            -CompareTo() ile karşılaştırılan StringBuilder'lar, metin olarak aynı ise sonuç 0 olur.

            -Metinler aynı değilse harf harf karşılaştırır,
            farklı olan ilk harfin diğer stringBuilder'daki harf ile arasında
            ascii tablosunda kaç karakter olduğunu söyler
         */


    }
}
