package day10_stringManipulations;

public class C04_substring {
    public static void main(String[] args) {

        String str = "Java Candir";

        // String' de iki farklı yöntemle substring elde edebiliriz
        // 1- tek parametre yazarsak

        System.out.println(str.substring(3)); // a Candir
        System.out.println(str.substring(0)); // Java Candir
        System.out.println(str.substring(9)); // ir

        // son 3 karakteri yazdırın
        System.out.println(str.substring(8)); // dir

        // dinamik olması için length' i kullanarak yazalım
        System.out.println(str.substring(str.length() - 3)); // dir

        // System.out.println(str.substring(20)); // StringIndexOutOfBoundsException

        System.out.println(str.substring(str.length())); // boş bir satır döndürür
        System.out.println("--");

        // System.out.println(str.substring(str.length() + 1));
        // StringIndexOutOfBoundsException

        // 2- iki parametre yazarsak
        // ilk parametreye eşit olan index'ten başlar, ikinci parametreye eşit olan index'e kadar yazdırır
        // ilk indexx dahil -- ikinci index dahil değil... 1,6

        System.out.println(str.substring(1, 6)); // ava C
        System.out.println(str.substring(0, 7)); // Java Ca

        System.out.println(str.substring(1, 2)); // a

        // 7.index'teki elemanı yazdırın

        System.out.println(str.charAt(7)); // n
        System.out.println(str.substring(7, 8)); // n

        // str.charAt(7). olduğu için yeni method kullanılamıyor
        // str.substring(7,8). String olduğu için method kullanabiliriz

        System.out.println(str.substring(2, 2)); //hiçlik

        // System.out.println(str.substring(6, 4)); // StringIndexOutOfBoundsException

        // ilk 7 karakteri yazdırın

        System.out.println(str.substring(0, 7));  // Java Ca

    }
}
