package day06_ifElseStatements;

import java.util.Scanner;

public class C03_ifStatements {
    public static void main(String[] args) {

        // Soru 1- Kullanicidan bir sayi isteyin,
        //               sayiyi kontrol edip 5 ile bolunebiliyorsa
        //               "Sayi 5'in tam kati" yazidirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi = scanner.nextInt();

        if (sayi % 5 == 0){
            System.out.println("Sayi 5'in tam kati");
        }

    }
}
