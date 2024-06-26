package day13_forLoop;

import java.util.Scanner;

public class C08_ForLoopFaktoriyel {
    public static void main(String[] args) {

        // Soru 6- Kullanıcıdan 20'den küçük bir sayı alıp, bu sayının faktöriyel değerini hesaplayın
        //         konsolda faktöriyel hesabının yapılışını da yazdırın.
        //         Orn: 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 20'den kucuk bir pozitif tamsayi giriniz");
        int sayi = scanner.nextInt();

        long faktoriyel = 1;
        System.out.print(sayi + "! = ");


        for (int i = sayi; i >= 1; i--) {
            faktoriyel *= i;

            if (i != 1) {
                System.out.print(i + " * ");
            } else {
                System.out.print(i + " = ");
            }

        }
        System.out.print(faktoriyel);
    }
}
