package day39_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_CokluTryCatch {

    public static void main(String[] args) {

        // Kullanıcıdan 2 sayı isteyin, birinci sayıyı ikinci sayıya bölüp, sonucun tamsayı kısmını yazdırın

        /*
            Birden fazla risk varsa, çözüm olarak
            1- riskler ayrı ayrı try-catch içine alınabilir
            2- iç-içe try-catch kullanılabilir
            3- tek try birden fazla catch bloğu olabilir

         */

        Scanner scanner = new Scanner(System.in);

        int sayi1 = 0;
        int sayi2 = 1;

        try {
            System.out.println("Lutfen bolunecek tamsayiyi girin");

            sayi1 = scanner.nextInt();

            System.out.println("Lutfen bolecek tamsayiyi girin");

            sayi2 = scanner.nextInt();

            System.out.println("ilk sayi / ikinci sayi :    " + sayi1 / sayi2);

        } catch (InputMismatchException e) {

            System.out.println("Tamsayi dedik TAMSAYI....");

        } catch (ArithmeticException e) {

            System.out.println("Bolecek sayi 0 OLAMAZ");

        } catch (Exception e) { // öngöremediğimiz başka bir exception oluşursa

            System.out.println("Girilen degerler uygun degil");
        }
    }
}
