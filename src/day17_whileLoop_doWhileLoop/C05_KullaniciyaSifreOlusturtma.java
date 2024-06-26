package day17_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C05_KullaniciyaSifreOlusturtma {
    public static void main(String[] args) {

        // Kullanicidan sifre isteyin , aşağıdaki şartları sağlayamayan şifrelerde hataları yadırıp, kullanıcının yeni şifre girmesini isteyin
        // Geçerli bir şefre yazılıncaya kadar bu işlemi tekrar edin, geçerli şifre yazılınca "sifreniz basari ile kaydedildi" yazdırın
        //- ilk harf kucuk harf olmali
        //- son karakter rakam olmali
        //- sifre bosluk icermemeli
        //- uzunlugu en az 10 karakter olmali


        Scanner scanner = new Scanner(System.in);
        int flag = 7;  // while loop'un çalışmaya başlayıp kullanıcıdan değer alabilmemiz için 0 dışında bir değer girdik

        String sifre = "";

        while (flag > 0) {

            flag = 0;

            System.out.println("Lutfen bir sifre giriniz");
            sifre = scanner.nextLine();


            //- ilk harf kucuk harf olmali
            char ilkHarf = sifre.charAt(0);
            if (!(ilkHarf >= 'a' && ilkHarf <= 'z')) {

                System.out.println("ilk harf kucuk olmali");
                flag++;

            }

            //- son karakter rakam olmali
            char sonKarakter = sifre.charAt(sifre.length() - 1);

            if (!(sonKarakter >= '0' && sonKarakter <= '9')) {
                System.out.println("son karakter rakam olmali");
            }

            //- sifre bosluk icermemeli

            if (sifre.contains(" ")) {
                System.out.println("sifre bosluk icermemeli");
                flag++;
            }

            //- uzunlugu en az 10 karakter olmali

            if (sifre.length() < 10) {
                System.out.println("uzunlugu en az 10 karakter olmali");
                flag++;
            }
        }
        System.out.println("sifreniz basari ile kaydedildi");
    }
}
