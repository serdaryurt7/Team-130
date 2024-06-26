package day07_ifElseStatements;

import java.util.Scanner;

public class C05_BirimCevirme {
    public static void main(String[] args) {

        // Soru 4- Kullanıcıdan mesafeyi km olarak alın ve cevirmek istediği birimi sorun,
        // istediği birim metre veya santimetre ise cevirip yazdirin, yoksa "istediginiz birim sisteme kayitli degil" yazdırın.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen mesafeyi kilometre olarak giriniz");
        double mesafeKm = scanner.nextDouble();
        System.out.println("lutfen cevirmek istediginiz birimi giriniz");

        String birim = scanner.next();

        if (birim.equalsIgnoreCase("metre")) { // Metre, METRE, metre, METre
            System.out.println("Girilen mesafenin metre cinsinden degeri : " + mesafeKm * 1000);
        } else if (birim.equalsIgnoreCase("santimetre")) {
            System.out.println("Girilen mesafenin santimetre cinsinden degeri : " + mesafeKm * 100000);
        } else {
            System.out.println("Sadece metre ve santimetreye çevirebilirim, \nistediginiz birim sisteme kayitli degil");
        }

    }
}
