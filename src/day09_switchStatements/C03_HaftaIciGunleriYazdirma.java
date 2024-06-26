package day09_switchStatements;

import java.util.Scanner;

public class C03_HaftaIciGunleriYazdirma {
    public static void main(String[] args) {

        // Kullanıcıdan gün ismini isteyin
        // girilen günün hafta içi veya hafta sonu olduğunu yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen gun ismi giriniz");
        String gunIsmi = scanner.next().toLowerCase();

        switch (gunIsmi){
            case "pazartesi":
            case "sali":
            case "carsamba":
            case "persembe":
            case "cuma":
                System.out.println("hafta ici");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("hafta sonu");
            break;
            default:
                System.out.println("Gun ismi yanlis");
        }

    }
}
