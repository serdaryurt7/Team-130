package day10_stringManipulations;

import java.util.Locale;

public class C01_StringManipulation {
    public static void main(String[] args) {

        String str = "Java Candir";

        // str' ı büyük harflerle yazdırın.
        System.out.println(str.toUpperCase()); // JAVA CANDİR

        // str' ı küçük harflerle yazdırın.
        System.out.println(str.toLowerCase()); // java candir

        // String methodları kullanıldığında orjinal metin değişmez.
        // Değişikliği kalıcı olmasını istersek ATAMA yapmalıyız.
        System.out.println(str); // Java Candir

        str = str.toUpperCase();

        System.out.println(str); // JAVA CANDİR

        //str'ı kucuk harfe cevirin
        // ancak I harfi kucuk harfe cevrildiginde ingilizce i olur

        System.out.println(str.toLowerCase()); // java candir

        // eğer metinde ingilizce olmayan I'yi
        // Turkce kucuk harfe çevirmek istersek
        // toLowerCase (Locale...) kullanilabilir

        System.out.println(str.toLowerCase(Locale.forLanguageTag("TR"))); // java candır

        System.out.println("Ahmet Çağrı"); // Ahmet Çağrı
    }
}
