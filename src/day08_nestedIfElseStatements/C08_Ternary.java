package day08_nestedIfElseStatements;

import java.util.Scanner;

public class C08_Ternary {
    public static void main(String[] args) {

        // Soru 2- Kullanıcıdan bir üçgenin 3 kenar uzunluğunu alın, üçgen eşenar ise
        // "Eskenar ucgen" yazdirin, degilse "Eskenar degil" yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Uc kenar uzunlugu giriniz: ");
        int kenar1 = scanner.nextInt();
        int kenar2 = scanner.nextInt();
        int kenar3 = scanner.nextInt();

        System.out.println(kenar1 == kenar2 && kenar1 == kenar3 && kenar1 > 0 ? "Eskenar ucgen" : "Eskenar degil");
    }
}
