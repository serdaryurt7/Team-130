package day17_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C01_WhileLoop {
    public static void main(String[] args) {

        // Kullanıcıdan başlangıç ve bitiş değerlerini alın, başlangıç ve bitiş dahil olarak
        // bu iki sayı arasındaki tüm tamsayıları toplayın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen baslangic ve bitis degerleri olarak 2 tamsayi giriniz");
        int baslangic = scanner.nextInt();
        int bitis = scanner.nextInt();

        // while loop ile yapalım

        int sayi = baslangic;
        int toplam = 0;

        while (sayi <= bitis) {

            toplam += sayi;
            sayi++;

        }

        System.out.println(baslangic + " ile " + bitis + " arasindaki sayilarin toplami : " + toplam);


    }
}
