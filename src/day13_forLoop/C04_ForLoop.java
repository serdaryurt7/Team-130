package day13_forLoop;

import java.util.Scanner;

public class C04_ForLoop {

    public static void main(String[] args) {

        // Soru 2- Kullanıcıdan pozitif bir tamsayı alın, 1' den girilen sayıya kadar (girilen sayı dahil) 7 ile bölünebilen sayıları yazdırın.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int tamSayi = scanner.nextInt();

        for (int i = 1; i <= tamSayi; i++) {

            if (i % 7 == 0) {
                System.out.print(" " + i);
            }

        }


    }
}
