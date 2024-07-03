package day40_exceptions;

import java.util.Scanner;

public class C03_ExceptionSoru {

    public static void main(String[] args) {

        // Kullanıcıdan istediği kadar sayı girmesini söyleyin
        // girdiği sayılardan pozitif olanları toplayın
        // negatif sayı veya 0 girerse, toplamaya eklemeyin
        // toplama işlemini bitirmek için kullanıcı Q' ya basmalıdır
        // kullanıcı Q' ya bastığında
        // toplam kaç pozitif sayı girdiğini ve toplamların kaç olduğunu yazdırın

        int toplananSayiAdedi = 0;
        int toplam = 0;
        int girilenSayi = 0;
        String girilenHarf = "a"; // Q dışında herhangi bir değer atadım
        Scanner scanner = new Scanner(System.in);

        while (!girilenHarf.equals("Q")) {

            System.out.println("Lutfen toplanmak uzere pozitif tamsayilar giriniz" + "\nBitirmek icin Q'ya basin");


            try {
                girilenSayi = scanner.nextInt();

                if (girilenSayi > 0) {

                    toplam += girilenSayi;
                    toplananSayiAdedi++;
                } else {
                    System.out.println("Negatif sayilar veya 0 isleme dahil edilmez");
                }

            } catch (Exception e) {

                girilenHarf = scanner.next();
                if (!girilenHarf.equalsIgnoreCase("q")) {
                    System.out.println("Lutfen bir tamsayi yazin veya Q'ya basin");
                }
            }

        }

        System.out.println(toplananSayiAdedi + " adet pozitif sayi girildi ve toplamlari : " + toplam);

    }

}
