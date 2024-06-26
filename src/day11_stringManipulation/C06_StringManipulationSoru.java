package day11_stringManipulation;

import java.util.Scanner;

public class C06_StringManipulationSoru {
    public static void main(String[] args) {

        // Soru 1- Kullanıcıdan bir cümle alın
        //         -Cümlede ev geçiyorsa, "home home sweet home" yazdırın
        //         -Cümlede iş geçiyorsa, "calismak guzeldir" yazdırın
        //         -ikisini de içeriyorsa, "Hem ev lazim hem is" yazdırın
        //         -hiçbirini içermiyorsa, "cok calisman lazim" yazdırın

        Scanner scanner = new Scanner(System.in);
        String cumle = scanner.nextLine();

        // önce iki şartı olanın kontrolü olmalı hem ev hem iş

        if (cumle.contains("ev") && cumle.contains("is")) {
            System.out.println("Hem ev lazim hem is");
        } else if (cumle.contains("is")) {
            System.out.println("calismak guzeldir");
        } else if (cumle.contains("ev")) {
            System.out.println("home home sweet home");
        } else {
            System.out.println("cok calisman lazim");
        }
    }
}


