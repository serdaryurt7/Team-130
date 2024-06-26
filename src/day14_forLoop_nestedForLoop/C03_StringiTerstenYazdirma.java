package day14_forLoop_nestedForLoop;

import java.util.Scanner;

public class C03_StringiTerstenYazdirma {
    public static void main(String[] args) {

        // Soru 9 (interview) - Kullanıcıdan bir String isteyin ve String'i tersten yazdırın.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String metin = scanner.nextLine(); // Java Candir

        for (int i = metin.length() - 1; i >= 0; i--) {

            System.out.print(metin.charAt(i)); // ridnaC avaJ

        }
    }
}
