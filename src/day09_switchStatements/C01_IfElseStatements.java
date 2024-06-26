package day09_switchStatements;

import java.util.Scanner;

public class C01_IfElseStatements {
    public static void main(String[] args) {

        // Soru 4- Kullanıcıdan ISTQB kısaltmasındaki harflerden
        //         anlamını öğrenmek istediğini alın ve girilen harfin karşılığını yazdırın.
        // I: International
        // S: Software
        // T: Testing
        // Q: Qualifications
        // B: Board

        Scanner scanner = new Scanner(System.in);
        System.out.println("Anlamini ogrenmek istediginiz harfi giriniz");
        char girilenHarf = scanner.next().toUpperCase().charAt(0);

        if (girilenHarf == 'I') {
            System.out.println("International");
        } else if (girilenHarf == 'S') {
            System.out.println("Software");
        } else if (girilenHarf == 'T') {
            System.out.println("Testing");
        } else if (girilenHarf == 'Q') {
            System.out.println("Qualifications");
        } else if (girilenHarf == 'B') {
            System.out.println("Board");
        } else {
            System.out.println("Kisaltmada olan harflerden birini tercih edin");
        }

    }

}
