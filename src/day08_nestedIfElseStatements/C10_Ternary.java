package day08_nestedIfElseStatements;

import java.util.Scanner;

public class C10_Ternary {
    public static void main(String[] args) {


        // girilen sayının Mutlak degerini alma

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen mutlak degeri alinacak sayiyi giriniz: ");
        int girilenDeger = scanner.nextInt();
        int mutlakDegeriAlinanSayi = Math.abs(girilenDeger);

        System.out.println(girilenDeger < 0 ? "Mutlak deger : " + mutlakDegeriAlinanSayi : "Girilen deger : " + girilenDeger);

    }
}
