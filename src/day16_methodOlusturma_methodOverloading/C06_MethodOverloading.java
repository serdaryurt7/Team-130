package day16_methodOlusturma_methodOverloading;

public class C06_MethodOverloading {
    public static void main(String[] args) {

        /*
             Java bir class'ta aynı isimde birden fazla method olmasına izin verir
             ANCAK SIGNATURE'lari farklı olmak zorundadır.

             Signature = Method ismi + parametre data türleri demektir.

             Eger ayni isimde birden fazla method varsa
             1- Java öncelikle argument ve parametreler arasında % 100 uyumlu olan var mı diye kontrol eder
             2- Eğer % 100 uyum yoksa, casting ile kullanılabilecek var mı diye tümünü kontrol eder
             Birden fazla method casting ile çalışabilir durumda olursa, en az casting olanı kabul eder.
        */

        topla(6); // 1

        topla(3, 5); // 2

        topla(6.3, 5); // 3

        topla(2.4F, 5); // 4

        topla(2.3, 3.4); // 5

        topla('a',5); // topla char int ==> int int : 102  (en yakın yani en az casting olan signature'a gider)

        topla(2.3F,3.5F); // topla float float ==> double double : 5.799999952316284

        topla(4,5.2); // topla int double ==> double double : 9.2
    }

    public static void topla(int sayi) {
        System.out.println("Tek integer : " + (sayi + sayi));
    } // 1  topla int

    public static void topla(int a, int b) {
        System.out.println("int int : " + (a + b));
    } // 2   topla int-int

    public static void topla(double c, int d) {
        System.out.println("double int : " + (c + d));
    } // 3   topla double-int

    public static void topla(float c, int d) {
        System.out.println("float int : " + (c + d));
    } // 4   topla float-int

    public static void topla(double c, double d) {
        System.out.println("double double : " + (c + d));
    } // 5   topla double-double
}
