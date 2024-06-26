package day17_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C06_MethodIleSifreKontrolu {

    public static void main(String[] args) {

        //  Kullanicidan sifre isteyin, sifreyi bir method'da kontrol edin,
        //  method'da aşağıdaki şartları sağlayamayan şifrelerde hataları yazdırıp,
        //  method'dan şifrenin durumunu true yada false olarak döndürün. Main method'da kullanici geçerli bir sifre yazincaya kadar tekrar edin
        //  geçerli şifre yazılınca "sifreniz basari ile kaydedildi" yazdırın
        //  Şartlar:
        //- ilk harf kucuk harf olmali
        //- son karakter rakam olmali
        //- sifre bosluk icermemeli
        //- uzunlugu en az 10 karakter olmali

        Scanner scanner = new Scanner(System.in);
        String sifre = "";

        while (true) {  // sonsuz loop, yani while loop sifre method'dan true döndürene kadar sürekli çalışacak

            System.out.println("Lutfen sifrenizi giriniz");
            sifre = scanner.nextLine();

            boolean sonuc = sifreKontrol(sifre); // true veya false

            if (sonuc) {
                System.out.println("Sifreniz basari ile kaydedildi");
                break;
            }
        }
    }

    public static boolean sifreKontrol(String sifre) {

        int flag = 0;


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

        if (flag == 0) {

            return true;

        } else {

            return false;

        }
    }

}
