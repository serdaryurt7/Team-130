package day39_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_TryCatch {

    public static void main(String[] args) {

        // Kullanıcıdan 2 sayı isteyin, birinci sayıyı ikinci sayıya bölüp, sonucun tamsayı kısmını yazdırın

        Scanner scanner = new Scanner(System.in);

        /*
            İyi bir coder, yazdığı kodun neresinde, ne tür sorunlar oluşabileceğini öngörüp
            sorun oluşabilecek durumlar için, JAVA'ya yapması gerekenleri tembihler

            Eğer öngörülen risk birden fazla ise
            bu riski taşıyan kodlar ayrı ayrı try-catch blokları ile kontrol altına alınabilir
            AMMA bu durumda ikisi ayrı ayrı olduğuından, senkronize çalışmayabilir
         */

        int sayi1 = 0;
        int sayi2 = 1;

        try {
            System.out.println("Lutfen bolunecek tamsayiyi girin");

            sayi1 = scanner.nextInt();

            System.out.println("Lutfen bolecek tamsayiyi girin");

            sayi2 = scanner.nextInt();


        } catch (InputMismatchException e) {
            System.out.println("Tamsayi dedik TAMSAYI....");
        }

        try {
            System.out.println("ilk sayi / ikinci sayi :    " + sayi1 / sayi2);
        } catch (ArithmeticException e) {
            System.out.println("Bolecek sayi 0 OLAMAZ");
        }

    }

}
