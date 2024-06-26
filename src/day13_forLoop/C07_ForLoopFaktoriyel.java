package day13_forLoop;

import java.util.Scanner;

public class C07_ForLoopFaktoriyel {
    public static void main(String[] args) {

        // Soru 5- Kullanıcıdan 20'den küçük bir sayı alıp, bu sayının faktöriyel değerini hesaplayın
        // input = 5    output = 120 (5*4*3*2*1)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 20'den kucuk bir pozitif tamsayi giriniz");
        int sayi = scanner.nextInt();

        long faktoriyel = 1;

        for (int i = 1; i <= sayi; i--) {

            faktoriyel *= i;

        }
        System.out.println(faktoriyel);
    }
}
