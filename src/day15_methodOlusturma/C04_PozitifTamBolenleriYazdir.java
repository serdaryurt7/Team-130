package day15_methodOlusturma;

import java.util.Scanner;

public class C04_PozitifTamBolenleriYazdir {
    public static void main(String[] args) {

        // Soru 4- Kullanicidan main method içinde bir tamsayı alın.
        //         Girilen sayinin pozitif tam bölenleri yanyana yazdıran bir method oluşturun.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir pozitif tamsayi giriniz");
        int sayi = scanner.nextInt();

        pozitifBolenleriYazdir(sayi);

        pozitifBolenleriYazdir(640);

        pozitifBolenleriYazdir('z');

        /*
            Method call'da kullanılan argument ile Method parametreleri uyumlu olmalıdır.
            Eğer argument ve parametreler uyumlu olmazsa CTE oluşur kod çalışmaz.
         */

    }

    public static void pozitifBolenleriYazdir(int sayiM){

        for (int i = 1; i <=sayiM ; i++) {

            if (sayiM % i == 0){
                System.out.print(i + " ");
            }

        }
        System.out.println("");

    }

}
