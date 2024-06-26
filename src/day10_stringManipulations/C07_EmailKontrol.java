package day10_stringManipulations;

import java.util.Scanner;

public class C07_EmailKontrol {
    public static void main(String[] args) {

        // Kullanıcıdan email isteyin,
        // eğer @ işareti içermiyorsa "Yanlis giris"
        // eğer @gmail.com içermiyorsa "girilen mail gmail olmali"
        // mail @gmail.com ile bitmiyorsa "gecersiz mail"
        // mail bosluk iceriyorsa "Yazim hatasi" yazdirin
        // eger hata yoksa "mailiniz kaydedildi" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen email adresinizi giriniz");
        String eMail = scanner.nextLine();

        if (!eMail.contains("@")) {
            System.out.println("Yanlis giris");
        } else if (!eMail.contains("@gmail.com")) {
            System.out.println("girilen mail gmail olmali");

        } else if (!eMail.endsWith("@gmail.com")) {
            System.out.println("Gecersiz mail");
        } else if (eMail.contains(" ")) {
            System.out.println("Yazim hatasi");
        } else {
            System.out.println("mailiniz kaydedildi");
        }
    }
}
