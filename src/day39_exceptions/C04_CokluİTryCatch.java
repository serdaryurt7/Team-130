package day39_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C04_CokluİTryCatch {
    public static void main(String[] args) {

        // Kullanıcıdan 2 sayı isteyin, birinci sayıyı ikinci sayıya bölüp, sonucun tamsayı kısmını yazdırın

        /*
            Birden fazla risk varsa, çözüm olarak
            1- riskler ayrı ayrı try-catch içine alınabilir
            2- iç-içe try-catch kullanılabilir
            3- tek try birden fazla catch bloğu olabilir
            4- tek try, tüm riskleri kapsayan bir catch bloğu olabilir


            Eğer kodun çalışmaya devam etmesini istiyorsak ve asıl amaç Exception oluşmaması ise generic (daha kapsamlı) bir "Exception" kullanılabilir
            Eğer amaç sorunu da anlamak ise, bir önceki yöntem yapılarak spesifikleştirilebilir
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

        } catch (Exception e) {
            System.out.println("Girilen degerler kabul edilemez"); // Exception her türlü exception'ı yakalar

        }
    }

}
