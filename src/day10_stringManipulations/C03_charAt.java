package day10_stringManipulations;

public class C03_charAt {
    public static void main(String[] args) {

        String str = "Java Candir";

        // ilk harfi yazdirin

        System.out.println(str.charAt(0)); // J

        System.out.println(str.charAt(7)); // n

        // son harfi yazdirin

        System.out.println(str.charAt(10));
        System.out.println(str.charAt(11 - 1));
        System.out.println(str.charAt(str.length() - 1));

        // Eğer bir kod yazarken, verilen input'taki değişimleri algılasın ve
        // yeni haline göre isteneni yapsın istiyorsak dinamik kod yazmalıyız.
        // Bunun için elle yazacağımız index değerleri yerine metnin length'ini kullanabiliriz

        System.out.println(str.length()); // 11

        // sondan 3. cü harfi yazdırın

        System.out.println(str.charAt(str.length() - 3)); // d

        // System.out.println(str.charAt(20)); // StringIndexOutOfBoundsException

        // System.out.println(str.charAt(str.length())); // StringIndexOutOfBoundsException


    }
}
