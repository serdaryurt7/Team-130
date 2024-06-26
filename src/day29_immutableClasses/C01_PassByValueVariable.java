package day29_immutableClasses;

import java.util.Scanner;

public class C01_PassByValueVariable {

    public static void main(String[] args) {

        // bir method yapıp, verilen sayının karesini döndürün

        int sayi = 11;

        System.out.println(getSquare(sayi)); // 121

        // verilen sayinin küpünü döndüren bir method oluşturun
        // main method'da kullanıcıdan bir değer alıp, küpünü hesaplatalım, yeni değeri kullanıcıdan alınan değer olarak kaydedelim

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int girilenSayi = scanner.nextInt();

        girilenSayi = getCube(girilenSayi);
        System.out.println(girilenSayi);


    }

    public static int getSquare(int a) {

        return a * a;
    }

    public static int getCube(int girilenSayi) {

        return girilenSayi * girilenSayi * girilenSayi;
    }

}
