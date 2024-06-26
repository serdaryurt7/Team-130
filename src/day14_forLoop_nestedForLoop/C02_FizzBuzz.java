package day14_forLoop_nestedForLoop;

import java.util.Scanner;

public class C02_FizzBuzz {
    public static void main(String[] args) {

        // Soru 8 (interview) - Kullanıcıdan pozitif bir sayı alın, 1'den başlayarak verilen sayıya kadar tüm sayıları yazdır.
        //                    - 3 ile bölünebilen bir sayıya gelirse, sayı yerine fizz
        //                    - 5 ile bölünebilen bir sayıya gelirse, buzz
        //                    - hem 3 hem 5 ile bölünebilen bir sayıya gelirse sayı yerine fizzBuzz yazdırın


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int girilenSayi = scanner.nextInt();


        for (int i = 1; i <= girilenSayi; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}

