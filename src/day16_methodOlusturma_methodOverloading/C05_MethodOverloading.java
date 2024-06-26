package day16_methodOlusturma_methodOverloading;

public class C05_MethodOverloading {
    public static void main(String[] args) {

        // verilen iki sayıyı toplayıp, sonucu yazdıran bir method oluşturun.

        toplaYazdir(5, 7); // iki integer degerin toplami : 12
        toplaYazdir(7.4, 6); // double ve integer degerin toplami : 13.4
        toplaYazdir("Trabzon ", 61); // Trabzon 61

        // toplaYazdir(5,5.3) // Cannot resolve method 'toplaYazdir(int, double)'

        toplaYazdir('4','a'); // iki integer degerin toplami : 149
        // toplaYazdir(char,char) yok ama, char ascii sayesinde int'a dönüşebildiği için, toplaYazdir(int,int) method'u kullanılabilir.

        toplaYazdir(3.5f,5); // double ve integer degerin toplami : 8.5

        // float double değildir ama auto widening ile double bir değişkene float değer atayabiliriz


    }

    public static void toplaYazdir(int sayi1, int sayi2) {

        System.out.println("iki integer degerin toplami : " + (sayi1 + sayi2));

    }

    // parametre değiştirerek, aynı method'u 2 kere oluşturabilir miyiz?
    // 'toplaYazdir(int, int)' is already defined in 'day16_methodOlusturma_methodOverloading.C05_MethodOverloading'
    // Java parametrelerin adına değil data türüne bakıyor
    // yukarıdaki method toplaYazdir(int, int) varken yenisini oluşturamazsınız
    /*
        Java'da method ismi ve parametrelerin data türleri birlikte düşünüldüğünde ortaya çıkan metne METHOD SIGNATURE denir.
        toplaYazdir(int,int)
        Java method'lardaki parametre isimlerine değil METHOD SIGNATURE'ına bakar. Aynı method signature'ına sahip birden fazla method oluşturmanıza izin vermez.
     */
    public static void toplaYazdir(double a, int b) {

        System.out.println("double ve integer degerin toplami : " + (a + b));

    }

    public static void toplaYazdir(String a, int b) {

        System.out.println("String ve integer degerin toplami : " + (a + b));

    }
}
